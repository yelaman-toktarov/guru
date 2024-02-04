import org.junit.jupiter.api.*;

public class JunitExampels {

    @BeforeAll
    static void setUtp(){

    }

    @AfterAll
    static void setOff(){

    }

    @BeforeEach
    void beforeEach(){

    }

    @AfterEach
    void afterEach(){

    }


    @Test
    void test(){
        System.out.println("Testas ");
    }

}
