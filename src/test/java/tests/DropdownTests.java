package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;


public class DropdownTests extends BaseTest {

    @Test
    public void getDropdownSizeTest() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.openDropdownPage();
        int dropdownActualSize = dropdownPage.getDropdownSize();
        Assert.assertEquals(dropdownActualSize, 3);
    }
}
