
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class TextBoxTests  {

    @Test
   public void openTest(){
       open("https://demoqa.com");

       sleep(4000);
   }
}
