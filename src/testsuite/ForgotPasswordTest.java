package testsuite;
/**
 * Write down the following test into ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfully
 *      click on the ‘Forgot your password’ link
 *      Verify the text ‘Reset Password’
 */
import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void SetUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //click on the ‘Forgot your password’ link
        WebElement forgotPassword = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        forgotPassword.click();

        //Verify the text 'Reset Password'
        //expected result
        String expectedText = "Reset Password";
        WebElement actualTextElement = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));
        String actualText = actualTextElement.getText();
        //verify expected and actual text
        Assert.assertEquals(expectedText,actualText);
    }
    @After
    public void tearDown(){

        closeBrowser();
    }




}
