package github;

import static com.codeborne.selenide.Selenide.*;
import org.junit.jupiter.api.Test;

public class SelenideRepositorySearchIT {
  @Test
  void shouldFindSelenideRepositoryAtTheTop(){
    open("https://github.com/");
    $("title").click();


  }
}
