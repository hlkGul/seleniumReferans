package com.egitim.testautomation.page;

import com.egitim.testautomation.base.BasePage;
import org.openqa.selenium.WebDriver;
import static com.egitim.testautomation.constants.ConstantsLoginPage.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage login() {

        //getDriver().findElements(testObject).size();
        clickElement(EMAIL);
        //sendKeys(PASSWORD, "123456@21145.com");
        waitSeconds(2);
        return new LoginPage(driver);
    }
}
