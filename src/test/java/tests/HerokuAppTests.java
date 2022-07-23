package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HerokuAppTests extends BaseTest {

    @Test
    public void addRemoveElementsTest() {
        driver.get(Urls.ADD_REMOVE_ELEMENTS);
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
        WebElement deleteButton1 = driver.findElement(By.cssSelector("#elements > button:first-child"));
        WebElement deleteButton2 = driver.findElement(By.cssSelector("#elements > button:last-child"));
        boolean theOnlyChild = deleteButton1.equals(deleteButton2);
        Assert.assertTrue(theOnlyChild, "More than one Delete button is displayed");
    }

    @Test
    public void table1Test() {
        driver.get(Urls.TABLES);
        String emailTable1 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[3]")).getText();
        if (emailTable1.equals("fbach@yahoo.com")) {
            String firstNameTable1 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[2]")).getText();
            String lastNameTable1 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[1]")).getText();
            Assert.assertEquals(firstNameTable1, "Frank");
            Assert.assertEquals(lastNameTable1, "Bach");
        } else {
            Assert.assertTrue(false, "First table data has been changed");

        }
    }

    @Test
    public void table2Test() {
        driver.get(Urls.TABLES);
        String emailTable2 = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[2]/td[3]")).getText();
        if (emailTable2.equals("fbach@yahoo.com")) {
            String dueTable2 = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[2]/td[4]")).getText();
            String websiteTable2 = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[2]/td[5]")).getText();
            Assert.assertEquals(dueTable2, "$51.00");
            Assert.assertEquals(websiteTable2, "http://www.frank.com");
        } else {
            Assert.assertTrue(false, "Second table data has been changed");

        }

    }


}
