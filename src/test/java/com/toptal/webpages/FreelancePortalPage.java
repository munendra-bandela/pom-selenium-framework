package com.toptal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreelancePortalPage {
    private WebDriver driver;

    @FindBy(tagName = "h1")
    private WebElement heading;

    @FindBy(name = "commit")
    private WebElement joinToptalButton;

    @FindBy(id = "talent_create_applicant_email")
    private WebElement email;

    @FindBy(id = "talent_create_applicant_password")
    private WebElement password;

    // constructor
    public FreelancePortalPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // methods
    public boolean isPageOpened() {
        return heading.getText().contains("Top Freelancers");
    }

    public void clickOnJoin() {
        joinToptalButton.click();
    }

    public void setEmail(String email) {
        this.email.clear();
        this.email.sendKeys(email);
    }

    public void setPassword(String password) {
        this.password.clear();
        this.password.sendKeys(password);
    }
}
