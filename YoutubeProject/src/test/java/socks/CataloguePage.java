package socks;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CataloguePage extends BaseSeleniumPage {
  @FindBy (xpath = "//a[contains(@onclick, '1896')]")
  private WebElement addFirstLot;

  @FindBy (xpath = "//a[contains(@onclick, '2d88')]")
  private WebElement addSecondLot;

  @FindBy (xpath = "//span[@id='numItemsInCart']")
  private WebElement checkout;

  public CataloguePage() {
    PageFactory.initElements(driver, this);
  }

  public CataloguePage addLots(){
    addFirstLot.click();
    //addSecondLot.click();
    return new CataloguePage();
  }

  public BasketPage goToBasket(){
    checkout.click();
    return new BasketPage();
  }

}
