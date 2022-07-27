package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TyposPage extends BasePage {

    private By MESSAGE_TEXT = By.xpath("//p[2]");

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void openTyposPage() {
        driver.get(Urls.TYPOS);
    }

    public static final String EXPECTED_TEXT = "Sometimes you'll see a typo, other times you won't.";

    public String getMessageText() {
        return driver.findElement(MESSAGE_TEXT).getText();
    }


}
