package hm.qa.guru.tests;

import hm.qa.guru.exampels.JunitExampels;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class SecondClass extends JunitExampels {
    @BeforeEach
    void makeFile() {
        System.out.println("    Befor each TextBoxTest classes");
    }

    @Test
    public void openTest2() {
        open("https://demoqa.com");
        System.out.println("        openTest2");
        sleep(4000);
    }
}
