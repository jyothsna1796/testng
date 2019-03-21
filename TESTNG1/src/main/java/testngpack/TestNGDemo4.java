package testngpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class TestNGDemo4
{
	
WebDriver driver=null;
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
		System.out.println("Browser is closed");
	}
	
	@BeforeTest
	
	public void setup() {
		System.out.println("hello");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\jpujala\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("This is before Test");
	}
	
	@Test
	public void second() throws InterruptedException {
		System.out.println("Testing started");
		Thread.sleep(2000);
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("jyothsnapujala");
		driver.findElement(By.xpath(".//*[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@name='password']")).sendKeys("thinkbig99");
		//driver.findElement(By.xpath("(.//*[name()='svg'])[5]")).click();
		driver.findElement(By.xpath(".//*[text()='Next']")).click();
		System.out.println("Testing of gmail application");
	}
	
	@Test
	public void test() 
	{
		System.out.println("miracle");
		
	
	}
	@Test
	public void first()
	{
		System.out.println("hellllllooooooo");
	}
	@Test(priority=1,invocationCount=3)
	public void last()
	{
		System.out.println("hi Welcome to miracle");
	}
	
}
