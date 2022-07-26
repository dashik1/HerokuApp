package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InputsPage;

public class InputsTests extends BaseTest {


    @Test
    public void inputDownTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.clickDown();
        Assert.assertEquals(inputsPage.getAttribute(), "-1");

    }

    @Test
    public void inputUpTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.clickUp();
        Assert.assertEquals(inputsPage.getAttribute(), "1");
    }
}
