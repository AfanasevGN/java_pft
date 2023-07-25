package socks;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage extends BaseSeleniumPage {

  @FindBy(xpath = "//th[@id='cartTotal']")
  private WebElement basketSummary;

  @FindBy(xpath = "//th[@id='orderSubtotal']")
  private WebElement orderSummary;

  public BasketPage() {
    PageFactory.initElements(driver, this);
  }

  public String getBasketSummary(){
    return basketSummary.getText();
  }

  public String getOrderSummary(){
    return orderSummary.getText();
  }

}
