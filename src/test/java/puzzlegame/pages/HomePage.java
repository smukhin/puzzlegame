package puzzlegame.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

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

    @FindBy(how = How.NAME, name = "card")
    public WebElement cardNumber;

    @FindBy(how = How.CLASS_NAME, className = "set-messages")
    public WebElement setMessage;


    public boolean getGameZone() {
        return gameZone.isDisplayed();
    }

    public String getMessageText() {
        return setMessage.getText();
    }

    public String getCurrentGameDate() {
        return currentGameDate.getText();
    }

    private List<String> getSrc() {
        List<String> src = new ArrayList<>();
        for (WebElement element : currentCardsList) {
            src.add(element.getAttribute("src"));
        }
        return src;
    }

    public List<Integer> getImgNumber() {
        List<Integer> img = new ArrayList<>();
        for (String src : getSrc()) {
            img.add(Integer.valueOf(src.replaceAll("\\D+", "")));
        }
        return img;
    }


    private List<SetCards[]> getMappedObject(){
        SetCards t = new SetCards();
        SetCards[] cards = t.mappedCards();
        List<SetCards[]> obj = new ArrayList<>();
        for(SetCards card: cards){
            obj.add(cards);
        }
        return obj;
    }


    public List<String> _getCurrentCardsDeck() throws Exception {
        List<String> deck = new ArrayList<>();
        for(int i : getImgNumber()) {
            for(SetCards[] card : getMappedObject()){
                for (int j = 1; j < card.length; j++) {
                    if (i == card[j].index) {
                        deck.add(card[j].toString());
                    }
                }
                break;
            }
        }
        return deck;
    }

    public List<SetCards> getCurrentCardsDeck() throws Exception {
        List<SetCards> deck = new ArrayList<>();
        for(int i : getImgNumber()) {
            for(SetCards[] card : getMappedObject()){
                for (int j = 1; j < card.length; j++) {
                    if (i == card[j].index) {
                        deck.add(card[j]);
                    }
                }
                break;
            }
        }
        return deck;
    }

    public void findSet(int numCards) throws Exception {
        int target = numCards / 2;
        SetCards[] cards;
        SetCards[][] sets = new SetCards[target][3];

        int cnt;
        do {
            Collections.shuffle(Arrays.asList(getCurrentCardsDeck()));
            cards = getCurrentCardsDeck().toArray(new SetCards[0]);
            cnt = 0;

            outer:
            for (int i = 0; i < cards.length - 2; i++) {
                for (int j = i + 1; j < cards.length - 1; j++) {
                    for (int k = j + 1; k < cards.length; k++) {
                        if (validSet(cards[i], cards[j], cards[k])) {
                            if (cnt < target)
                                sets[cnt] = new SetCards[]{cards[i], cards[j], cards[k]};
                                clickCard(i+1);
                                clickCard(j+1);
                                clickCard(k+1);
                            if (++cnt > target) {
                                break outer;
                            }
                        }
                    }
                }
            }
        } while (cnt != target);

        Arrays.sort(cards);

        System.out.printf("GIVEN %d CARDS:\n\n", numCards);
        for (SetCards c : cards) {
            System.out.println(c);
        }
        System.out.println();

        System.out.println("FOUND " + target + " SETS:\n");
        for (SetCards[] set : sets) {
            for (SetCards c : set) {
                System.out.println(c);
            }
            System.out.println();
        }

    }

    private static boolean validSet(SetCards c1, SetCards c2, SetCards c3) {
        int tot = 0;
        tot += (c1.c.val + c2.c.val + c3.c.val) % 3;
        tot += (c1.n.val + c2.n.val + c3.n.val) % 3;
        tot += (c1.s.val + c2.s.val + c3.s.val) % 3;
        tot += (c1.f.val + c2.f.val + c3.f.val) % 3;
        return tot == 0;
    }


  public void clickCard(int value) throws InterruptedException {
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.name("card" + value + ""));
        element.click();
  }



}
