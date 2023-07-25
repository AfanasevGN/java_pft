package futbin;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/** главная страница сайта futbin.com
 *
 */

public class MainFutbinPage {
  private final SelenideElement signInButton = $x("//a[@class=' btn-fb btn-fb-small btn-fb-green waves-effect waves-light']");

 public MainFutbinPage(String url){
    Selenide.open(url);

 }
  public void clickOnSignIn(){
    signInButton.click();
  }

}
