package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;

public class TyposTests extends BaseTest {

    @Test
    public void typosTest() {

        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        Assert.assertEquals(typosPage.getMessageText(), typosPage.EXPECTED_TEXT);


    }


}
