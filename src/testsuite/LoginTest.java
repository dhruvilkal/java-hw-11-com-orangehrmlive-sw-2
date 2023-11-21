package testsuite;
/**
 * Write down the following test into ‘LoginTest’ class
 * 1. userShouldLoginSuccessfullyWithValidCredentials
 *      Enter “Admin” username
 *      Enter “admin123 password
 *      Click on ‘LOGIN’ button
 *      Verify the ‘Dashboard’ text is display
 */
import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void SetUp(){

        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        // Enter “Admin” username
        WebElement adminField = driver.findElement(By.name("username"));
        adminField.sendKeys("Admin");
        //Enter “admin123 password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");
        //Click on ‘LOGIN’ button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        //Verify
        String expectedText ="Dashboard";
        String actualText = driver.findElement(By.xpath("//h6[@class = 'oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        Assert.assertEquals(expectedText,actualText);


    }
    @After
    public void tearDown(){

        closeBrowser();
    }
}
