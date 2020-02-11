package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass2 {

@Test
  public void ass()  {
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://techfios.com/test/billing/?ng=admin/");
	driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
	driver.findElement(By.id("password")).sendKeys("abc123");
	driver.findElement(By.name("login")).click();
	driver.findElement(By.linkText("Add Deposit")).click();
	driver.findElement(By.id("select2-account-container")).click();
	
	 
	//	driver.findElement(By.id("description")).sendKeys("millondollor");
	WebElement testDropDown = driver.findElement(By.id("testingDropdown"));  
	//testDropDown.findElement(By.id("select2-account-container")).click(); 
	//driver.findElement(By.id("description")).sendKeys("million");
	
	
	}

}
  

