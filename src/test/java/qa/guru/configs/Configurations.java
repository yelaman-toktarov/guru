package qa.guru.configs;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class Configurations {

    @BeforeAll
    public static void setUp() {
        ChromeOptions options = new ChromeOptions();
        //Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = true;
        Configuration.webdriverLogsEnabled = true;
        Configuration.pageLoadTimeout = 5000;
        options.addArguments("start-maximized");
        options.addArguments("enable-automation");
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
    }

    @AfterEach
    public void afterEach() {
        closeWebDriver();
    }

    @AfterAll
    public static void setOff() {
    }

}
