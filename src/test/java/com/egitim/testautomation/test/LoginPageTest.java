package com.egitim.testautomation.test;

import com.egitim.testautomation.page.LoginPage;
import org.junit.Before;
import org.junit.Test;

public class LoginPageTest extends com.egitim.testautomation.base.BaseTest {
    LoginPage loginPage;

    @Before
    public void before() {
        loginPage = new LoginPage(getDriver());
    }

    @Test
    public void test() {
        loginPage.login();
    }

}
