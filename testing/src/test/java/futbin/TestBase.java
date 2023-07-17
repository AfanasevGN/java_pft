package futbin;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class TestBase {

  private Map<String, Object> vars;

  protected static void clickOnSquadBuilder() {
    actions().moveToElement($(byTagName("body")), 0, 0).perform();
    actions().moveToElement($(byLinkText("Squad Builder"))).perform();
    $(byLinkText("Squad Builder")).click();
  }

  protected static void fillLoginForm(String username, String password) {
    $("#Email").val(username);
    actions().moveToElement($(".btn-primary")).perform();
    $("#Password").val(password);
    $(".btn-primary").click();
  }

  protected static void clickOnLoginButton() {
    actions().moveToElement($(byLinkText("Sign in"))).perform();
    $(byLinkText("Sign in")).click();
    actions().moveToElement($(byTagName("body")), 0, 0).perform();
    $(".md-form:nth-child(3) > label").click();
  }

  @BeforeEach
  public void setUp() {
    Configuration.browser = "chrome";
    vars = new HashMap<>();
  }

  @AfterEach
  public void tearDown() {
  }
}
