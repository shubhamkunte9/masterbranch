package utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilities {
	
	WebDriver driver;
	
	
	}

	public void scrrenshot(WebDriver driver ,int testid) throws IOException
	{
		DateFormat d = new SimpleDateFormat("MM/dd/yyyy HH:MM:ss");
		Date date = new Date();
		String dateandtime = d.format(d);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("test-output"+File.separator+"testscreenshot"+File.separator+"test_"+testid+dateandtime+".jpg");
		FileHandler.copy(source, dest);
		
	}

}
