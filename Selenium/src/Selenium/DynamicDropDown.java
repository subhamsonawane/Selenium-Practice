package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicDropDown {

	public static void main(String[] args) {
		System.setProperty( 
				"webdriver.edge.driver", 
				"C:\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(); 
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		 
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1']/option[1]")).click();
	
	}

}
