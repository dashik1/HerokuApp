package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends BasePage {

    private By JS_ALERT = By.xpath("//button[text()='Click for JS Alert']");
    private By JS_CONFIRM = By.xpath("//button[text()='Click for JS Confirm']");
    private By JS_PROMPT = By.xpath("//button[text()='Click for JS Prompt']");
    private By RESULT = By.xpath("//p[@id='result']");

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void openAlertsPage() {
        driver.get(Urls.ALERTS);
    }

    public void openJsAlert() {
        driver.findElement(JS_ALERT).click();
    }

    public void openJsConfirm() {
        driver.findElement(JS_CONFIRM).click();
    }

    public void openJsPrompt() {
        driver.findElement(JS_PROMPT).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public String getResult() {
        return driver.findElement(RESULT).getText();
    }

    public String sendTextToPromptAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
        return text;
    }


}
