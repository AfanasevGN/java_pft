import org.junit.Assert;
import org.junit.Test;

public class FutbinTest extends  BaseTest {
  private final static String BASE_URL = "https://futbin.com/";

  @Test
  public void openSquadBuilder() {
    MainFutbinPage mainFutbinPage = new MainFutbinPage(BASE_URL);
    mainFutbinPage.clickOnSignIn();
  }
}