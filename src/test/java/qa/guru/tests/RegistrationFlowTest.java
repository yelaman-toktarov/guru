package qa.guru.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import qa.guru.configs.Configurations;
import qa.guru.pages.RegistrationPage;
import qa.guru.pages.components.RegistrationResultsModal;


import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationFlowTest extends Configurations {

    String firstname = "arman";
    String lastName = "kabibulov";
    String email = "user@mail.ru";
    String gender = "Male";
    String mobile = "2312312312";
    String day = "20";
    String month = "April";
    String year = "2023";
    //String birthDate = "20" + "April" +"2023";
    String subject = "Math";
    String hobbie = "Sports";
    String file  = "file.jpg";
    String currentAddress = "currentAddress";
    String state  = "NCR";
    String city  = "Delhi";
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    public void fillTest() {
        registrationPage
                .openPage()
                .setFirstName(firstname)
                .setLastName(lastName)
                .setuserEmail(email)
                .setGender(gender)
                .setMobile(mobile)
                .setDateOfBirth(day,month,year)
                .setSubjects(subject)
                .setHobbies(hobbie)
                .uploadFile(file)
                .setCurrentAddress(currentAddress)
                .setState(state)
                .setCity(city)
                .submit()
                .verifyResult(registrationPage.registrationResultsModal.getStudentName(), firstname + " " + lastName)
                .verifyResult(registrationPage.registrationResultsModal.getStudentEmail(), email)
                .verifyResult(registrationPage.registrationResultsModal.getGender(), gender)
                .verifyResult(registrationPage.registrationResultsModal.getMobile(), mobile)
                .verifyResult(registrationPage.registrationResultsModal.getDateOfBirthay(), day + " " + month + "," + year);
    }
}
