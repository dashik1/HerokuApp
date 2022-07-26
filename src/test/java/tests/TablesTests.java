package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TablesPage;

public class TablesTests extends BaseTest {

    @Test
    public void table1Test() {
        TablesPage tablesPage = new TablesPage(driver);
        tablesPage.openTablesPage();
        if (tablesPage.isEmailExpectedTable1()) {
            Assert.assertEquals(tablesPage.getFirstNameTable1(), "Frank");
            Assert.assertEquals(tablesPage.getLastNameTable1(), "Bach");
        } else {
            Assert.assertTrue(false, "First table data has been changed");
        }

    }

    @Test
    public void table2Test() {
        TablesPage tablesPage = new TablesPage(driver);
        tablesPage.openTablesPage();
        if (tablesPage.isEmailExpectedTable2()) {
            Assert.assertEquals(tablesPage.getDueTable2(), "$51.00");
            Assert.assertEquals(tablesPage.getWebsiteTable2(), "http://www.frank.com");
        } else {
            Assert.assertTrue(false, "Second table data has been changed");
        }

    }

}
