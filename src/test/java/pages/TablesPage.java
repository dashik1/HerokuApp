package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TablesPage extends BasePage {
    public TablesPage(WebDriver driver) {
        super(driver);
    }

    public void openTablesPage() {
        driver.get(Urls.TABLES);
    }

    private By EMAIL_TABLE_1 = By.xpath("//table[@id='table1']/tbody/tr[2]/td[3]");
    private By FIRST_NAME_TABLE_1 = By.xpath("//table[@id='table1']/tbody/tr[2]/td[2]");
    private By LAST_NAME_TABLE_1 = By.xpath("//table[@id='table1']/tbody/tr[2]/td[1]");

    private By EMAIL_TABLE_2 = By.xpath("//table[@id='table2']/tbody/tr[2]/td[3]");
    private By DUE_TABLE_2 = By.xpath("//table[@id='table2']/tbody/tr[2]/td[4]");
    private By WEBSITE_TABLE_2 = By.xpath("//table[@id='table2']/tbody/tr[2]/td[5]");


    public String getFirstNameTable1() {
        return driver.findElement(FIRST_NAME_TABLE_1).getText();
    }

    public String getLastNameTable1() {
        return driver.findElement(LAST_NAME_TABLE_1).getText();
    }

    public boolean isEmailExpectedTable1() {
        return driver.findElement(EMAIL_TABLE_1).getText().equals("fbach@yahoo.com");
    }

    public String getDueTable2() {
        return driver.findElement(DUE_TABLE_2).getText();
    }

    public String getWebsiteTable2() {
        return driver.findElement(WEBSITE_TABLE_2).getText();

    }

    public boolean isEmailExpectedTable2() {
        return driver.findElement(EMAIL_TABLE_2).getText().equals("fbach@yahoo.com");
    }


}