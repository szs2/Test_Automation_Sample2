package main.java.org.example.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
    private WebDriver driver;

    @FindBy(name = "user_name")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "sign_in")
    private WebElement signInButton;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        if (!driver.getTitle().equals("Sign in page")) {
            throw new IllegalStateException("This is not the sign in page, current page is " + driver.getCurrentUrl());

        }
        PageFactory.initElements(driver, this);

    }

}
