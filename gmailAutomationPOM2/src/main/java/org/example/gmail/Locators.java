package main.java.org.example.gmail;

import java.net.URI;

import org.openqa.selenium.By;

public class Locators {
    // SignInPage Locators

    public static final By USERNAME_INPUT = By.name("username");
    public static final By PASSWORD_INPUT = By.name("password");
    public static final By SIGNIN_BUTTON = By.name("sign_in");

    // Homepage Locators
    public static final By MESSAGE_HEADING = By.tagName("h1");

    // Main Page Locators
    public static final String USERNAME = "myusername";
    public static final String Password = "mypassword";
    public static final String BASE_URL = "https://www.advantageonlineshopping.com/#/";

}
