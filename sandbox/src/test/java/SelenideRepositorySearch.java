import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class SelenideRepositorySearch {
    @Test
    void shouldFindSelenideRepositoryAtTheTop(){
        Selenide.open("https://github.com/");
        $("[id=query-builder-test]").setValue("selenide").pressEnter();
        sleep(5000);


    }

}
