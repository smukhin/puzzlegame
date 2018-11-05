package puzzlegame;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import puzzlegame.pages.CongratulationsPage;
import puzzlegame.pages.HomePage;

public class SetGameTest extends TestNgTestBase {

  private HomePage homepage;
  private CongratulationsPage congratulationsPage;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
    congratulationsPage = PageFactory.initElements(driver, CongratulationsPage.class);
  }

  public void openUrl(){
    driver.get(baseUrl);
    driver.manage().window().fullscreen();
  }

  @Test
  public void testHomePageHasAHeader() {
    openUrl();
    Assert.assertEquals("The Daily SET Puzzle", homepage.header.getText());
  }

  @Test
  public void testGameData(){
    openUrl();
    Assert.assertEquals("Wednesday, October 31, 2018", homepage.getCurrentGameDate());
  }

  @Test
  public void testMapping() throws Exception {
    openUrl();
    homepage.findSet(12);
    Assert.assertTrue(congratulationsPage.getCongratulationMsg());
  }


}
