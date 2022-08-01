package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class FramePage extends BasePage {

    private By SOURCE_ELEMENT = By.xpath("//div[@id='draggable']");
    private By TARGET_ELEMENT = By.xpath("//div[@id='droppable']");
    private By FRAME = By.tagName("iframe");
    private By MOVE_RESULT_TEXT = By.xpath("//div[@id='droppable']/p");

    Actions actions = new Actions(driver);

    public FramePage(WebDriver driver) {
        super(driver);
    }

    public void openFramePage() {
        driver.get(Urls.FRAME);
    }

    public void switchToFrame() {
        driver.switchTo().frame(driver.findElement(FRAME));
    }

    public void moveElement() {
        actions.dragAndDrop(driver.findElement(SOURCE_ELEMENT), driver.findElement(TARGET_ELEMENT)).build().perform();
    }

    public String getMoveResultText() {
        return driver.findElement(MOVE_RESULT_TEXT).getText();
    }


}
