package automationclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.testng.Assert;
import org.openqa.selenium.WebDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
        // Setup Firefox WebDriver using WebDriverManager
        WebDriverManager.firefoxdriver().setup();
        
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        
        // Now you can use 'driver' to interact with the Firefox browser
        // For example, navigate to a URL
       // driver.get("https://www.saucedemo.com/");
     // Maximize the browser window
       // driver.manage().window().maximize();
        
     // Get the title of the webpage
        //String pageTitle = driver.getTitle();
        
        // Check the title using if-else statements
//        if (pageTitle.equals("Swag Labs")) {
//            System.out.println("Title is as expected: " + pageTitle);
//        } else {
//            System.out.println("Title is not as expected. Actual title is: " + pageTitle);
//        }
        
        // Navigate to saucedemo.com
        driver.get("https://www.saucedemo.com");

     // Get the title of the webpage
        String expectedTitle = "Swag Labs";
        String pageTitle = driver.getTitle();

        // Check the title using assertEquals
        Assert.assertEquals(pageTitle, expectedTitle, "Title mismatch");

        // Get the current URL
        String expectedURL = "https://www.sauceemo.com/";
        String currentURL = driver.getCurrentUrl();

        // Check the URL using assertEquals
        Assert.assertEquals(currentURL, expectedURL, "URL mismatch");
		
	}

}
