package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TyposTests extends BaseTest {

    @Test

    public void typosTest() {
        driver.get(Urls.TYPOS);
        String actualText = driver.findElement(By.xpath("//p[2]")).getText();
        String expectedText = "Sometimes you'll see a typo, other times you won't.";
        Assert.assertEquals(actualText,expectedText);


    }
}
