package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownPage extends BasePage {

    private By DROPDOWN_LIST = By.id("dropdown");
    Select selectOption = new Select(driver.findElement(DROPDOWN_LIST));


    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void openDropdownPage() {
        driver.get(Urls.DROPDOWN);
    }

    public int getDropdownSize() {
        return selectOption.getOptions().size();
    }
}
