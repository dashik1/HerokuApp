package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage extends BasePage {

    private By CHOOSE_FILE_INPUT = By.xpath("//input[@id='file-upload']");
    private By UPLOAD_BUTTON = By.xpath("//input[@id='file-submit']");
    private By UPLOADED_FILE_NAME = By.xpath("//div[@id='uploaded-files']");


    public UploadPage(WebDriver driver) {
        super(driver);
    }

    public void openUploadPage() {
        driver.get(Urls.UPLOAD);
    }

    public void selectFile() {
        driver.findElement(CHOOSE_FILE_INPUT)
                .sendKeys(System.getProperty("user.dir")
                        .concat("/src/test/resources/test_file.txt"));
    }

    public void clickUploadButton() {
        driver.findElement(UPLOAD_BUTTON).click();
    }

    public String getUploadedFileName() {
        return driver.findElement(UPLOADED_FILE_NAME).getText();
    }
}
