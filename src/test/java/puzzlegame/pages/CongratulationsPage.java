package puzzlegame.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CongratulationsPage extends HomePage{
    public CongratulationsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.CLASS_NAME, className = "form-item webform-component webform-component-markup webform-component--congratulations")
    boolean congratulationMSG;

    public boolean getCongratulationMsg(){
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        congratulationMSG = wait.until(ExpectedConditions.urlToBe("https://www.setgame.com/you-completed-todays-puzzle"));
        return congratulationMSG;
    }
}
