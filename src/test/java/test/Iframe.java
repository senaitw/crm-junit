package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframe {
	
	WebDriver driver;
	@Before
	public void frameparent() { 
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://docs.oracle.com/javase/8/docs/api/");
}
@Test

public void iframe() throws InterruptedException {

	//System.out.println(driver.findElement(By.tagName("frame")).getSize());

Thread.sleep(3000);

driver.switchTo().frame("packageListFrame");
Thread.sleep(3000);
driver.findElement(By.linkText("java.applet")).click();
Thread.sleep(3000);

driver.switchTo().defaultContent();

driver.switchTo().frame("packageFrame");
new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("AppletContext")));
Thread.sleep(2000);
driver.findElement(By.linkText("AppletContext")).click();

Thread.sleep(2000);
//driver.switchTo().defaultContent();
//driver.switchTo().frame("classFrame");

//new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='topNav']/descendant::li[2]]")));
//Thread.sleep(2000);
//driver.findElement(By.xpath("//div[@class='topNav']/descendant::li[2]]")).click();
}
@Test
public void frame2() throws InterruptedException {
Thread.sleep(3000);
driver.switchTo().frame(0);
Thread.sleep(3000);
driver.findElement(By.linkText("java.io")).click();
Thread.sleep(3000);

driver.switchTo().defaultContent();


driver.switchTo().frame(1);
new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Closeable")));
//Thread.sleep(5000);
driver.findElement(By.partialLinkText("Closeable")).click();


	
}
@After
public void CloseEverything() {
	driver.close();
	driver.quit();
}	
}
