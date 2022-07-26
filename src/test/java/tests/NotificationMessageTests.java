package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessageTests extends BaseTest {

    @Test
    public void notificationMessageTest() {
        driver.get(Urls.NOTIFICATION_MESSAGE);
        driver.findElement(By.xpath("//a[text()='Click here']")).click();
        String displayedNotificationMessage = driver.findElement(By.xpath("//div[@id='flash']")).getText();
        String actualNotificationMessage = displayedNotificationMessage.replaceAll("\n×", "");
        String expectedNotificationMessage = "Action successful";
        Assert.assertEquals(actualNotificationMessage, expectedNotificationMessage);

    }
}
