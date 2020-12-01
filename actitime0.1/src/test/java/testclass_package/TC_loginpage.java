package testclass_package;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.Pojo;

import page_object.homepage_pom;
import page_object.loginpage_pom;
import utilities.utilities;


public class TC_loginpage extends Pojo {
	WebDriver driver;
	loginpage_pom l = new loginpage_pom(driver);
	@BeforeTest
	@Parameters ("browser")
	public void openbrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = openchromebrowser();
		}
		else if (browser.equalsIgnoreCase("chrome"))
		{
			 driver= openchromebrowser1();
		}
	}
	@BeforeClass
	public void launchurl()
	{
		driver.get("http://localhost/login.do");
	}
	@BeforeMethod
	public void kl()
	{
		System.out.println("beforemethod");
	}
	@Test
	public void login()
	{
		l.username();
		l.password();
		l.loginbutton();
		String currenturl = driver.getCurrentUrl();
	    Assert.assertEquals(currenturl, "http://localhost/user/submit_tt.do");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	@AfterClass
	public void afterclass()
	{
		l = null;
	}
	@AfterTest
	public void close()
	{
		driver.quit();
		driver = null;
		System.gc();
	}

	
	

}
