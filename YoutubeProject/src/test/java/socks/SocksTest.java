package socks;

import com.sun.tools.javac.Main;
import core.BaseSeleniumTest;
import org.junit.Assert;
import org.junit.Test;
import readProperties.ConfigProvider;

public class SocksTest extends BaseSeleniumTest {


  //Написать на языке Java e2e тест по авторизации и добавления товара в корзину.
  //Проверить, что сумма цены товаров в корзине соответствует сумме цен заказанных товаров.

  @Test
  public void checkSumTest(){
    String loginValue = ConfigProvider.USER_LOGIN;
    String passwordValue = ConfigProvider.USER_PASSWORD;
    MainSockPage mainSockPage = new MainSockPage();
    mainSockPage.authorization(loginValue, passwordValue)
        .openCataloguePage().addLots().goToBasket();
    BasketPage basketPage = new BasketPage();
    Assert.assertEquals(basketPage.getBasketSummary(), basketPage.getOrderSummary());


  }

}
