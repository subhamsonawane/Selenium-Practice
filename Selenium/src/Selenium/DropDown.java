package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( 
	            "webdriver.edge.driver", 
	            "C:\\edgedriver_win64\\msedgedriver.exe");
		
	        WebDriver driver = new EdgeDriver(); 
	        driver.manage().window().maximize(); 
	       // driver.wait();
	  
	        // URL of the login website that is tested 
	        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    WebElement staticDropdown =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	        Select dropdown=  new Select(staticDropdown);
	        
	        dropdown.selectByIndex(3);
	    System.out.println("Selected Dropdown: "+ dropdown.getFirstSelectedOption().getText());
	 dropdown.selectByVisibleText("AED");
	 System.out.println(dropdown.getFirstSelectedOption().getText());
	 dropdown.selectByVisibleText("INR");
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    
	    driver.findElement(By.xpath("//a[text()='Special Assistance']")).click();
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    Thread.sleep(2000);
	  
	    WebElement elem = driver.findElement(By.xpath("//th[text()='Download'][1]"));
	    Thread.sleep(1000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView()", elem);
	    driver.findElement(By.cssSelector("#SpecialAssistanceWindow")).click();
	    driver.quit();

	}

}
