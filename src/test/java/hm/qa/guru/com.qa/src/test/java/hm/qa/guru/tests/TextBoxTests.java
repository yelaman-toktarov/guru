package hm.qa.guru.com.qa.src.test.java.hm.qa.guru.tests;

import hm.qa.guru.com.qa.src.test.java.hm.qa.guru.exampels.JunitExampels;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class TextBoxTests extends JunitExampels {



    @Test
    public void openTest() {
        open("https://demoqa.com");
        System.out.println("        openTest");
        sleep(4000);
    }
}
