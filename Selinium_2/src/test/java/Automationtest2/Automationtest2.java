package Automationtest2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automationtest2 {

    public static void main(String[] args) throws InterruptedException {
        // Setup Firefox WebDriver using WebDriverManager
        WebDriverManager.firefoxdriver().setup();
        
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
     // Maximize the browser window
        
        
        // Now you can use 'driver' to interact with the Firefox browser
        // For example, navigate to a URL
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
      
        // Close the browser
        driver.quit();
    }
}
 