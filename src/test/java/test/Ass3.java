package test;

import java.util.concurrent.TimeUnit;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Ass3 {

@Test
  public void ass() throws InterruptedException  {
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://techfios.com/test/billing/?ng=admin/");
	driver.findElement(By.xpath("//*[@type='text']")).sendKeys("techfiosdemo@gmail.com");
	driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("abc123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	

  driver.findElement(By.xpath("//a[contains(text(),'Add Deposit')]")).click();
  
  
	//Thread.sleep(3000);
  Select select = new Select(driver.findElement(By.cssSelector("select#account")));
  select.selectByVisibleText("xyz");
   
   Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='description']")).sendKeys("Abalance");
driver.findElement(By.xpath("//input[@class='form-control amount']")).sendKeys("10,000.00");
	driver.findElement(By.xpath("//*[@id='submit']")).click();
	Thread.sleep(3000);
	
	
	driver.close();
	driver.quit();
	
	
	}

}
  

