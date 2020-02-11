package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousElements {

	@Test
	public void exploreVariousElements() throws InterruptedException {
		//set Chrome Driver as your default driver 
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//Instantiate() ChromeDrivaer object 
	
	WebDriver driver = new ChromeDriver();
	//Implicity Wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// Delete cookies and history
	//driver.manage().deleteAllCookies();
	//Maximize Browser
	driver.manage().window().maximize();
	//go to a site 
	driver.get("http://www.objectspy.space/");
	//slow down java 1000 millis second = 1 sec 
//	Thread.sleep(3000);
	// click on radio button male
//	driver.findElement(By.id("sex-0")).click();
	//Thread.sleep(3000);
	
//Type something in the fields
    driver.findElement(By.name("firstname")).sendKeys("Senait");
	Thread.sleep(3000);
	// click on link text
	driver.findElement(By.linkText("Link:New page")).click();
	Thread.sleep(3000);
	
	//click on partial link
	driver.findElement(By.partialLinkText("OS-API Product FrontEnd")).click();
	Thread.sleep(3000);
	// it gone close the browser 
	driver.close();
	//it will quit or shut down the driver
	driver.quit();
	
	}
	
}
