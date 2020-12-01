package browser;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pojo {
	
	
	public static WebDriver openchromebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "src"+ File.separator +"test" + File.separator+ "resources"+ File.separator+ "driver" + File.separator+ "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	public static WebDriver openchromebrowser1()
	{
		System.setProperty("webdriver.chrome.driver", "src"+ File.separator +"test" + File.separator+ "resources"+ File.separator+ "driver"+File.separator+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	

}
