package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;

public class CheckboxesTests extends BaseTest {

    @Test
    public void firstCheckboxUncheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxPage();
        Assert.assertFalse(checkboxesPage.isFirstCheckboxChecked(), "First checkbox is checked!");

    }

    @Test
    public void firstCheckboxCheckTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxPage();
        checkboxesPage.checkFirstCheckbox();
        Assert.assertTrue(checkboxesPage.isFirstCheckboxChecked(), "First checkbox has not been checked!");

    }

    @Test
    public void secondCheckboxCheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxPage();
        Assert.assertTrue(checkboxesPage.isSecondCheckboxChecked(), "Second checkbox is not checked!");

    }

    @Test
    public void secondCheckboxUncheckTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxPage();
        checkboxesPage.uncheckSecondCheckbox();
        Assert.assertFalse(checkboxesPage.isSecondCheckboxChecked(), "First checkbox has not been unchecked!");

    }


}
