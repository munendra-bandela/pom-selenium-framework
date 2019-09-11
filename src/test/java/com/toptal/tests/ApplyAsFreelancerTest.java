package com.toptal.tests;

import com.toptal.webpages.FreelancePortalPage;
import com.toptal.webpages.HomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplyAsFreelancerTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\H330045\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void applyAsDeveloper() {
        // open homepage
        HomePage homePage = new HomePage(driver);
        homePage.clickOnFreelanceApplyButton();

        // create object of freelance apply page
        FreelancePortalPage freelancePortalPage = new FreelancePortalPage(driver);
        Assert.assertTrue(freelancePortalPage.isPageOpened());

        // fill up data
        freelancePortalPage.setEmail("munendra.bandela@honeywell.com");
        freelancePortalPage.setPassword("hello world");
    }

    @After
    public void close() {
        driver.close();
    }
}
