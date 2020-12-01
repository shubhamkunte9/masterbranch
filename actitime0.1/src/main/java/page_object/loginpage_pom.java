package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage_pom {
	
	@FindBy (xpath = "//input[@name='username']")
	private WebElement usename;
	
	@FindBy (xpath = "//input[@name='pwd']")
	private WebElement pass;
	
	@FindBy (xpath = "//a[@id='loginButton']")
	private WebElement loginbutton;
	
	public loginpage_pom (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void username()
	{
		String s = usename.getText();
	}
	public void password()
	{
		pass.sendKeys("manager");
	}
	public void loginbutton()
	{
		loginbutton.click();
	}

}
