package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NotificationMessagePage;

public class NotificationMessageTests extends BaseTest {

    @Test
    public void notificationMessageTest() {
        NotificationMessagePage notificationMessagePage = new NotificationMessagePage(driver);
        notificationMessagePage.openNotificationMessagePage();
        notificationMessagePage.clickHereLink();
        Assert.assertEquals(notificationMessagePage.removeArtifacts(), NotificationMessagePage.EXPECTED_NOTIFICATION_MESSAGE);


    }
}
