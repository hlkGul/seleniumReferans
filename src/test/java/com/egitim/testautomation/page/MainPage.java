package com.egitim.testautomation.page;

import com.egitim.testautomation.base.BasePage;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage homeControl() {
        // Logonun geldiği kontrol edilir.
        return new MainPage(driver);
    }

    public MainPage logoControl() {
        // Logonun geldiği kontrol edilir.
        return new MainPage(driver);
    }
}
