package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTests extends BaseTest {

    @Test
    public void firstCheckboxUncheckedTest() {
        driver.get(Urls.CHECKBOXES);
        boolean isFirstCheckboxChecked = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).isSelected();
        Assert.assertFalse(isFirstCheckboxChecked, "First checkbox is checked!");

    }

    @Test
    public void firstCheckboxCheckTest() {
        driver.get(Urls.CHECKBOXES);
        WebElement firstCheckbox = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        firstCheckbox.click();
        Assert.assertTrue(firstCheckbox.isSelected(), "First checkbox has not been checked!");
    }

    @Test
    public void secondCheckboxCheckedTest() {
        driver.get(Urls.CHECKBOXES);
        boolean isSecondCheckboxChecked = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isSelected();
        Assert.assertTrue(isSecondCheckboxChecked, "Second checkbox is not checked!");

    }

    @Test
    public void secondCheckboxUncheckTest() {
        driver.get(Urls.CHECKBOXES);
        WebElement secondCheckbox = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        secondCheckbox.click();
        Assert.assertFalse(secondCheckbox.isSelected(), "Second checkbox has not been unchecked!");

    }


}
