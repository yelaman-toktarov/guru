package qa.guru.tests;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import qa.guru.configs.Configurations;
import qa.guru.data.UserData;
import qa.guru.pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;


public class RegistrationFlowTest extends Configurations {


    RegistrationPage registrationPage = new RegistrationPage();
    UserData personData = new UserData();

    @BeforeEach
    public void beforeEach() {
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#RightSide_Advertisement').remove()");
        executeJavaScript("$('#M884765ScriptRootC1461781_07487').remove()");
    }

    @DisplayName("Succes registration")
    @Tag("BLOCKER")
    @Test
    public void fillTest() {
        registrationPage
                .setFirstName(personData.getFirstname())
                .setLastName(personData.getLastName())
                .setuserEmail(personData.getEmail())
                .setGender(personData.getGender())
                .setMobile(personData.getMobile())
                .setDateOfBirth(personData.getDay(), personData.getMonth(), personData.getYear())
                .setSubjects(personData.getSubject())
                .setHobbies(personData.getHobbie())
                .uploadFile(personData.getFile())
                .setCurrentAddress(personData.getCurrentAddress())
                .setState(personData.getState())
                .setCity(personData.getCity())
                .submit()
                .verifyResult(registrationPage.registrationResultsModal.getStudentNameLocator(), personData.getFirstname() + " " + personData.getLastName())
                .verifyResult(registrationPage.registrationResultsModal.getStudentEmailLocator(), personData.getEmail())
                .verifyResult(registrationPage.registrationResultsModal.getGenderLocator(), personData.getGender())
                //todo  Исправить проверку или передачу данных ожидаемый результат
                //.verifyResult(registrationPage.registrationResultsModal.getMobile(), personData.getMobile())
                .verifyResult(registrationPage.registrationResultsModal.getDateOfBirthayLocator(), personData.getDay() + " " + personData.getMonth() + "," + personData.getYear());
    }
}
