package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddRemoveElementsPage extends BasePage {
    private By ADD_ELEMENT_BUTTON = By.xpath("//button[text()='Add Element']");
    private By DELETE_BUTTON = By.xpath("//button[text()='Delete']");
    private By FIRST_CHILD = By.cssSelector("#elements > button:first-child");
    private By LAST_CHILD = By.cssSelector("#elements > button:last-child");

    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    public void openAddRemoveElementsPage() {
        driver.get(Urls.ADD_REMOVE_ELEMENTS);
    }


    public void addElement() {
        driver.findElement(ADD_ELEMENT_BUTTON).click();
    }

    public void deleteElement() {
        driver.findElement(DELETE_BUTTON).click();
    }

    public boolean isOnlyChild() {
        return driver.findElements(FIRST_CHILD).equals(driver.findElements(LAST_CHILD));

    }


}
