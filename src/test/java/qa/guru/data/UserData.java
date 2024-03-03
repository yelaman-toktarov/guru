package qa.guru.data;

import com.github.javafaker.Faker;

public class UserData {

    Faker faker = new Faker();

    private String
            firstname = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = "Male",
           //mobile = faker.phoneNumber().phoneNumber(),
            mobile = "2312322222",
            day = "20",
            month = "April",
            year = "2023",
            birthDate = "20" + "April" + "2023",
            subject = "Math",
            hobbie = "Sports",
            file = "file.jpg",
            currentAddress = faker.name().firstName(),
            state = "NCR",
            city = "Delhi";

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getMobile() {
        return mobile;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getSubject() {
        return subject;
    }

    public String getHobbie() {
        return hobbie;
    }

    public String getFile() {
        return file;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }


}
