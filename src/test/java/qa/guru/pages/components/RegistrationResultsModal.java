package qa.guru.pages.components;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationResultsModal {

    private String
            studentName = "Student Name",
            studentEmail = "Student Email",
            gender = "Gender",
            mobile = "Mobile",
            dateOfBirth = "Date of Birth";


    public void verifyModalAppears() {
        $(".modal-dialog").should(appear);
        $(".modal-dialog").shouldBe(visible);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
    }

    public void verifyResult(String key, String value) {
        $(".table-responsive").$(byText(key)).parent()
                .shouldHave(text(value));
    }


    public String getStudentNameLocator() {
        return studentName;
    }

    public String getStudentEmailLocator() {
        return studentEmail;
    }

    public String getGenderLocator() {
        return gender;
    }

    public String getMobileLocator() {
        return mobile;
    }

    public String getDateOfBirthayLocator() {
        return dateOfBirth;
    }

}
