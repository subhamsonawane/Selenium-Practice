package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class PassengerDropdown {

	public static void main(String[] args) {
		System.setProperty( 
	            "webdriver.edge.driver", 
	            "C:\\edgedriver_win64\\msedgedriver.exe");
		
	        WebDriver driver = new EdgeDriver(); 
	        driver.manage().window().maximize(); 
		        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		        driver.findElement(By.id("divpaxinfo")).click();
		        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		        System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		        int i=1;
		        while(i<5) {
		        driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		 		        	i++;
		        }
		        System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		        
		       // Assert.assertEquals(driver.findElement(By.cssSelector("#divpaxinfo")).getText(),"5 Adult");
		        driver.findElement(By.id("btnclosepaxoption")).click();
		       // 
		       
		       driver.quit();
		        

	}

}
