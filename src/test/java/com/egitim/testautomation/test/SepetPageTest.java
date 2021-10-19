package com.egitim.testautomation.test;

import com.egitim.testautomation.page.SepetPage;
import com.egitim.testautomation.base.BaseTest;
import org.junit.Before;
import org.junit.Test;

public class SepetPageTest extends BaseTest {
    SepetPage sepetPage;

    @Before
    public void before() {
        sepetPage = new SepetPage(getDriver());
    }

    @Test
    public void sepetUrunKontrol() {
        sepetPage.sepetUrunTarama();
    }
}
