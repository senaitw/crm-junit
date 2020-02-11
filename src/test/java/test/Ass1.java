package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass1 {

@Test
  public void ass() throws InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	 WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 
	 driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	
	driver.findElement(By.name("userName")).sendKeys("mercury");
	driver.findElement(By.name("password")).sendKeys("mercury");
	Thread.sleep(3000);
	driver.findElement(By.name("login")).click();
	driver.findElement(By.linkText("SIGN-OFF")).click();
	
}

}
  

