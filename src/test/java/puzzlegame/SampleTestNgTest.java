package puzzlegame;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import puzzlegame.pages.HomePage;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  public void openUrl(){
    driver.get(baseUrl);
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
  public void testMapping(){
    openUrl();
    //System.out.println(homepage.getCards());
    System.out.println(homepage.getImgNumber());
//    List elements = new ArrayList();
//    elements.add(0,1);
//    elements.add(0,2);
//
//    Combination.combination(elements, 3);

  }
}
