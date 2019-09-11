package com.toptal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    // page url
    private static String PAGE_URL = "https://www.toptal.com";

    // locators
    @FindBy(xpath = "//a[text()='Apply as a Freelancer']")
    private WebElement freelancerApplyButton;

    @FindBy(tagName = "h1")
    private WebElement heading;

    // constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    // methods
    public void clickOnFreelanceApplyButton() {
        freelancerApplyButton.click();
    }

    public String getPageHeading() {
        return heading.getText();
    }

}
