package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Practice {
@Test
	public void popup() throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

driver.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(3000);
driver.switchTo().alert().accept();
driver.close();
driver.quit();


}


}	
	

