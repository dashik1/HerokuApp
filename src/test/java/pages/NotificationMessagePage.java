package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotificationMessagePage extends BasePage {
    public NotificationMessagePage(WebDriver driver) {
        super(driver);
    }

    public void openNotificationMessagePage() {
        driver.get(Urls.NOTIFICATION_MESSAGE);
    }

    private By CLICK_HERE_LINK = By.xpath("//a[text()='Click here']");
    private By NOTIFICATION_MESSAGE = By.xpath("//div[@id='flash']");

    public static final String EXPECTED_NOTIFICATION_MESSAGE = "Action successful";

    public void clickHereLink() {
        driver.findElement(CLICK_HERE_LINK).click();
    }


    public String removeArtifacts() {
        return driver.findElement(NOTIFICATION_MESSAGE).getText().replaceAll("\n×", "");

    }


}
