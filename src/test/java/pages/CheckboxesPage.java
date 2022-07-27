package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxesPage extends BasePage {

    private By FIRST_CHECKBOX = By.xpath("//form[@id='checkboxes']/input[1]");

    private By SECOND_CHECKBOX = By.xpath("//form[@id='checkboxes']/input[2]");

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckboxPage() {
        driver.get(Urls.CHECKBOXES);
    }

    public boolean isFirstCheckboxChecked() {
        return driver.findElement(FIRST_CHECKBOX).isSelected();
    }

    public void checkFirstCheckbox() {
        driver.findElement(FIRST_CHECKBOX).click();
    }

    public boolean isSecondCheckboxChecked() {
        return driver.findElement(SECOND_CHECKBOX).isSelected();
    }

    public void uncheckSecondCheckbox() {
        driver.findElement(SECOND_CHECKBOX).click();
    }


}
