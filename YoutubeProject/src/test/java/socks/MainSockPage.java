package socks;

import com.sun.tools.javac.Main;
import core.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigProvider;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница магазина носков
 */
public class MainSockPage extends BaseSeleniumPage {
  @FindBy(xpath = "//li[@id='login']")
  private WebElement loginWord;

  @FindBy(xpath = "//input[@id='username-modal']")
  private WebElement usernameField;

  @FindBy(xpath = "//input[@id='password-modal']")
  private WebElement passwordField;

  @FindBy(xpath = "//button[@onclick='return login()']")
  private WebElement loginButton;

  @FindBy(xpath = "//a[@class='dropdown-toggle']")
  private WebElement catalogue;

  public MainSockPage() {
    driver.get(ConfigProvider.URL);
    PageFactory.initElements(driver, this);
  }

  public MainSockPage authorization(String loginValue, String passwordValue) {
    loginWord.click();
    usernameField.click();
    usernameField.sendKeys(loginValue);
    passwordField.click();
    passwordField.sendKeys(passwordValue);
    loginButton.click();
    return new MainSockPage();
  }

  public CataloguePage openCataloguePage() {
    catalogue.click();
    return new CataloguePage();
  }

}


