package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTests extends BaseTest {


    @Test
    public void inputDownTest() {
        driver.get(Urls.INPUTS);
        WebElement inputField = driver.findElement(By.xpath("//input[@type='number']"));
        inputField.sendKeys(Keys.ARROW_DOWN);
        String displayedValue = inputField.getAttribute("value");
        Assert.assertEquals(displayedValue, "-1");
    }

    @Test
    public void inputUpTest() {
        driver.get(Urls.INPUTS);
        WebElement inputField = driver.findElement(By.xpath("//input[@type='number']"));
        inputField.sendKeys(Keys.ARROW_UP);
        String displayedValue = inputField.getAttribute("value");
        Assert.assertEquals(displayedValue, "1");
    }
}
