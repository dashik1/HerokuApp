package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramePage;

public class FrameTest extends BaseTest {

    @Test
    public void frameTest() {
        FramePage framePage = new FramePage(driver);
        framePage.openFramePage();
        framePage.switchToFrame();
        framePage.moveElement();
        String resultText = framePage.getMoveResultText();
        Assert.assertEquals(resultText, "Dropped!");

    }


}
