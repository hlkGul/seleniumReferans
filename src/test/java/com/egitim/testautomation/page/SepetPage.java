package com.egitim.testautomation.page;

import com.egitim.testautomation.base.BasePage;
import org.openqa.selenium.WebDriver;

public class SepetPage extends BasePage {

    public SepetPage(WebDriver driver) {
        super(driver);
    }

    public SepetPage sepetUrunTarama() {
        return this;
    }
}
