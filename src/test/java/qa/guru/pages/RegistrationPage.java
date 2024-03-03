package qa.guru.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import qa.guru.configs.Configurations;
import qa.guru.pages.components.CalendarComponent;
import qa.guru.pages.components.RegistrationResultsModal;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;

public class RegistrationPage {

    private final String URL = "/automation-practice-form";
    private final String TITLE_TEXT = "Student Registration Form";

    public CalendarComponent calendarComponent = new CalendarComponent();
    public RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();

    public RegistrationPage() {
    }
    private SelenideElement
            firstNameLocator = $("#firstName"),
            lastNameLocator = $("#lastName"),
            dateOfBirthLocator = $("#dateOfBirthInput"),
            emailLocator = $("#userEmail"),
            genderLocalor = $("#genterWrapper"),
            mobileLocator = $("#userNumber"),
            subjectsLocator = $("#subjectsInput"),
            hobbiesLocator = $("#hobbiesWrapper"),
            pictureLocator = $("#uploadPicture"),
            currentAddressLocator = $("#currentAddress"),
            stateLocator = $("#state"),
            cityLocator = $("#city"),
            submitLocator = $("#submit");


    public RegistrationPage openPage() {
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameLocator.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameLocator.setValue(value);
        return this;
    }

    public RegistrationPage setDateOfBirth(String day, String month, String year) {
        dateOfBirthLocator.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public RegistrationPage setuserEmail(String value) {
        emailLocator.setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value) {
        genderLocalor.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setMobile(String value) {
        mobileLocator.setValue(value);
        return this;
    }

    public RegistrationPage setSubjects(String value) {
        subjectsLocator.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies(String value) {
        hobbiesLocator.$(byText(value)).click();
        return this;
    }

    public RegistrationPage uploadFile(String value) {
        pictureLocator.uploadFromClasspath(value);
        return this;
    }

    public RegistrationPage setCurrentAddress(String value) {
        currentAddressLocator.setValue(value);
        return this;
    }

    public RegistrationPage setState(String value) {
        stateLocator.click();
        $("#stateCity-wrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationPage setCity(String value) {
        cityLocator.click();
        $("#stateCity-wrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationPage submit() {
        submitLocator.click();
        return this;
    }


    public RegistrationPage verifyResult(String key, String value) {
        registrationResultsModal.verifyModalAppears();
        registrationResultsModal.verifyResult(key, value);
        return this;
    }
}
