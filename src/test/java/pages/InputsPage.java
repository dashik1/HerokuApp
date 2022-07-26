package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class InputsPage extends BasePage {
    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void openInputsPage() {
        driver.get(Urls.INPUTS);
    }

    private By INPUT_FIELD = By.xpath("//input[@type='number']");

    public void clickUp() {
        driver.findElement(INPUT_FIELD).sendKeys(Keys.ARROW_UP);
    }

    public void clickDown() {
        driver.findElement(INPUT_FIELD).sendKeys(Keys.ARROW_DOWN);
    }

    public String getAttribute() {
        return driver.findElement(INPUT_FIELD).getAttribute("value");
    }


}
