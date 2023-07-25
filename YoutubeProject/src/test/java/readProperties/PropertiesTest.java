package readProperties;

import core.BaseTest;
import org.junit.Test;

public class PropertiesTest extends BaseTest {
  @Test
  public void readFromConf(){
    String urlFromConf = ConfigProvider.URL;
    System.out.println(urlFromConf);
  }

}
