package qa.guru.configs;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class Configurations {


    @BeforeAll
    public static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        System.out.println("BeforeAll");
    }

    @AfterAll
    public static void setOff() {
        System.out.println("AfterAll");
    }

    @BeforeEach
    public void beforeEach() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#RightSide_Advertisement').remove()");
        executeJavaScript("$('#M884765ScriptRootC1461781_07487').remove()");
    }

    @AfterEach
    public void afterEach() {
    }

}
