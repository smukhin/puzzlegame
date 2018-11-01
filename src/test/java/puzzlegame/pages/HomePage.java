package puzzlegame.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

/**
 * Sample page
 */
public class HomePage extends Page {

  @FindBy(how = How.TAG_NAME, using = "h1")
  @CacheLookup
  public WebElement header;

  public HomePage(WebDriver webDriver) {
    super(webDriver);
  }

  @FindBy(how = How.ID, id = "block-system-main")
  public WebElement gameZone;

  @FindBy(how = How.CSS, css = ".set-game-wrapper h1")
  public WebElement currentGameDate;

  @FindBy(how = How.CLASS_NAME, className = "set-card-td")
  public List<WebElement> cardsList;

  @FindBy(how = How.XPATH, xpath = "//div[@class='set-card-td']/a/img")
  public List<WebElement> currentCardsList;

  @FindBy(how = How.XPATH, xpath = "//a[@href=javascript:board.cardClicked(' + value + ')]")
  public WebElement cardNumber;

  @FindBy(how = How.CLASS_NAME, className = "set-messages-container")
  public WebElement setMessageContainer;

  public boolean getGameZone(){
    return gameZone.isDisplayed();
  }

  public String getMessageText(){
    return setMessageContainer.getText();
  }

  public String getCurrentGameDate(){
    return currentGameDate.getText();
  }

  public List<String> getSrc() {
  List<String> src = new ArrayList<>();
    for(WebElement element: currentCardsList){
      src.add(element.getAttribute("src"));
    }
    return src;
  }

  public List<String> getImgNumber(){
    List<String> img = new ArrayList<>();
    for(String src: getSrc()){
      img.add(src.replaceAll("\\D+",""));

    }
    return img;
  }

  public void setCard(String value){
    WebElement element = driver.findElement(By.xpath("//a[@href=javascript:board.cardClicked("+ value +")]"));
    element.click();
  }



}
