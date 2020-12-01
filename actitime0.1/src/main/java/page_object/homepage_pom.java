package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class homepage_pom {
	
	@FindBy (xpath = "//td[@class='navItem relative'][2]")
	private WebElement task;
	
	@FindBy (xpath = "//span[text()='Create Tasks']")
	private WebElement createtask;
	
	@FindBy (xpath ="//select[@name='customerId']")
	private WebElement dropdown;
	
	@FindBy (xpath = "//select[@name='projectId']")
	private WebElement dropdown1;
	
	@FindBy (xpath = "//input[@name='task[0].name']")
	private WebElement taskupdate;
	
	public homepage_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void task()
	{
		task.click();
	}
	public void createtask()
	{
		createtask.click();
	}
	public void dropdown()
	{
		Select s = new Select(dropdown);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
	}
	public void dropdown1()
	{
		Select m = new Select(dropdown1);
		m.selectByIndex(0);
		m.selectByIndex(1);
		m.selectByIndex(2);
		m.selectByIndex(3);
	}
	public void taskupdate()
	{
		
	}
	

}
