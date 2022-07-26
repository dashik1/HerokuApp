package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemoveElementsPage;

public class AddRemoveElementsTest extends BaseTest {

    @Test
    public void addRemoveElementsTest() {
        AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage(driver);
        addRemoveElementsPage.openAddRemoveElementsPage();
        addRemoveElementsPage.addElement();
        addRemoveElementsPage.addElement();
        addRemoveElementsPage.deleteElement();
        Assert.assertTrue(addRemoveElementsPage.isOnlyChild(), "More than one Delete button is displayed");


    }


}
