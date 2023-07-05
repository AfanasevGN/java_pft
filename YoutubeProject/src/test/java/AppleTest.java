import org.junit.Assert;
import org.junit.Test;

public class AppleTest extends BaseTest{

     private final static String BASE_URL = "https://appleinsider.ru/";
     private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";

     @Test
     public void checkHref (){
          MainPage mainPage = new MainPage(BASE_URL);
          mainPage.search(SEARCH_STRING);
          SearchPage searchPage = new SearchPage();
          String href = searchPage.getHrefFromFirstArticle();
          Assert.assertTrue(href.contains("iphone-13"));
     }

}
