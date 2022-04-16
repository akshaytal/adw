package Vtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Vpage.Fbpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FbTest {
	public static WebDriver driver;
	//m name akshay
	@BeforeClass
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		}
	
	@Test
	public void akshu() {
		Fbpage fb=new Fbpage(driver);
		fb.login("akshay@","123456");
		Assert.assertTrue(false);
	}

}
