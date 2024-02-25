package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.http.ClientConfig;



public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty( 
	            "webdriver.edge.driver", 
	            "C:\\edgedriver_win64\\msedgedriver.exe");
		
	        WebDriver driver = new EdgeDriver(); 
	       // driver.wait();
	  
	        // URL of the login website that is tested 
	        driver.get("https://practicetestautomation.com/practice-test-login/"); 
	     
	        //driver.manage().window().maximize(); 
//	        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//	       driver.findElement(By.cssSelector("div#sgpb-popup-dialog-main-div")).click();
	        // Enter your login email id 
	        driver.findElement(By.id("username")) 
	            .sendKeys("student"); 
	       String userName = driver.findElement(By.xpath("//label[text()='Username']")).getText();
            
	      System.out.println("UserName Entered student"+userName);
             
	        
	        driver.findElement(By.id("password")) 
            .sendKeys("Password123"); 
	        driver.findElement(By.xpath("//button[@id='submit']")).click();
	          // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	     //   driver.switchTo().alert().accept();
	        	String message =driver.findElement(By.xpath("//*[@class='post-title']")).getText();
	        	System.out.println("Success Message is: "+ message);
	        	driver.quit();
	        
            
	  
	     
	          
	     
	      
	        

	}

}
