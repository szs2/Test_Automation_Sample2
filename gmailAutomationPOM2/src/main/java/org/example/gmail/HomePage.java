package main.java.org.example.gmail;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(tagName = "h1")
    private WebElement message;

    public HomePage(WebDriver driver) {

        this.driver = driver;
        if (!driver.getTitle().equals("Home Page of Logged in user")) {
            throw new IllegalStateException(
                    "This is not theHome Page of logged in user,current page is: " + driver.getCurrentUrl());
        }
        PageFactory.initElements(driver, this);
    }

    public String getMessageText() {
        return message.getText();
    }
}