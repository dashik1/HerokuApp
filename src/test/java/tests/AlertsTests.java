package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTests extends BaseTest {

    @Test
    public void jsAlertTextTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        alertsPage.openJsAlert();
        String alertText = alertsPage.getAlertText();
        alertsPage.acceptAlert();
        String result = alertsPage.getResult();
        Assert.assertEquals(alertText, "I am a JS Alert");
        Assert.assertEquals(result, "You successfully clicked an alert");
    }

    @Test
    public void jsConfirmTextTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        alertsPage.openJsConfirm();
        String confirmText = alertsPage.getAlertText();
        alertsPage.dismissAlert();
        String result = alertsPage.getResult();
        Assert.assertEquals(confirmText, "I am a JS Confirm");
        Assert.assertEquals(result, "You clicked: Cancel");
    }

    @Test
    public void enterTextJsPromptTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        alertsPage.openJsPrompt();
        String testResult = "You entered: " + alertsPage.sendTextToPromptAlert("Test text for alert");
        alertsPage.acceptAlert();
        Assert.assertEquals(alertsPage.getResult(), testResult);
    }


}
