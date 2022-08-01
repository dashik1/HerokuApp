package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UploadPage;

public class UploadTests extends BaseTest {

    @Test
    public void uploadFileTest() {
        UploadPage uploadPage = new UploadPage(driver);
        uploadPage.openUploadPage();
        uploadPage.selectFile();
        uploadPage.clickUploadButton();
        String uploadedFileName = uploadPage.getUploadedFileName();
        Assert.assertEquals(uploadedFileName, "test_file.txt");

    }
}
