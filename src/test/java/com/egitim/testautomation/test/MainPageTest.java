package com.egitim.testautomation.test;

import com.egitim.testautomation.base.BaseTest;
import com.egitim.testautomation.page.MainPage;
import org.junit.Before;
import org.junit.Test;

public class MainPageTest extends BaseTest {

    MainPage mainPage;

    @Before
    public void before(){
        mainPage = new MainPage(getDriver());
    }
    @Test
    public void mainControl() {
        mainPage.callLoginPage().login();
    }
}
