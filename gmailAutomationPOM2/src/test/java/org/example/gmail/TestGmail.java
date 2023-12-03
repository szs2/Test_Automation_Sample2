package test.java.org.example.gmail;

import org.openqa.selenium.chrome.ChromeDriver;

import main.java.org.example.gmail.Locators;
import main.java.org.example.gmail.SignInPage;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestGmail {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "\"E:\\CCTB\\OOP\\Selenium Projects\\chromedriver.exe\"");
        ChromeDriver driver = new ChromeDriver();
        driver.get(Locators.BASE_URL);

        SignInPage signInPage = new SignInPage(driver);
        driver.close();
        driver.quit();

    }
}