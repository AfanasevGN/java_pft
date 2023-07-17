import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/** главная страница сайта futbin.com
 *
 */

public class MainFutbinPage {
  private final SelenideElement signInButton = $x("//li[@class='nav-item pt-1']");

 public MainFutbinPage(String url){
    Selenide.open(url);

 }
  public void clickOnSignIn(){
    signInButton.click();
  }

}
