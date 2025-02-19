package com.orangehrm.web.pages.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageLocators {
    public LoginPageLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    public WebElement loginHeader;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p' and text()='Username : Admin']")
    public WebElement usernameData;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p' and text()='Password : admin123']")
    public WebElement passwordData;

    @FindBy(xpath = "//label[@class='oxd-label' and text()='Username']")
    public WebElement usernameInputText;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//label[@class='oxd-label' and text()='Password']")
    public WebElement passwordInputText;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    public WebElement forgotPasswordLink;
}
