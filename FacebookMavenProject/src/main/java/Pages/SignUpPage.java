package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	@FindBy (xpath="//input[@name='firstname']") 
	private WebElement FirstName;
	
	@FindBy (xpath="//input[@name='lastname']") 
	private WebElement LastName;
	
	@FindBy (xpath="(//input[@data-type='text'])[3]") 
	private WebElement EmailID;
	
	@FindBy (xpath="(//input[@type='text'])[5]") 
	private WebElement ReEnterEmailID;
	
	@FindBy (xpath="(//input[@type='password'])[2]") 
	private WebElement NewPassword;
	
	@FindBy (xpath="//select[@name='birthday_day']") 
	private WebElement Day;
	
	@FindBy (xpath="//select[@name='birthday_month']") 
	private WebElement Month;
	
	@FindBy (xpath="//select[@name='birthday_year']") 
	private WebElement year;
	
	@FindBy (xpath="(//label[@class='_58mt'])[1]") 
	private WebElement Female;
	

	@FindBy (xpath="(//label[@class='_58mt'])[2]") 
	private WebElement Male;
	

	@FindBy (xpath="(//label[@class='_58mt'])[3]") 
	private WebElement Custom;
	
	@FindBy (xpath="(//button[text()='Sign Up'])[1]") 
	private WebElement SignUp;
	
	
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void FirstName()
	{
		FirstName.sendKeys("Ashwini");
	}
	public void LastName()
	{
		LastName.sendKeys("Mahure");
	}
	public void EmailID()
	{
		EmailID.sendKeys("ashu@gmail.com");
	}
	public void ReEnterEmailID()
	{
		ReEnterEmailID.sendKeys("ashu@gmail.com");
	}
	public void NewPassword()
	{
		NewPassword.sendKeys("123456789");
	}
	public void SignUp()
	{
		SignUp.click();
	}
	
	public void createLoginPage()
	{
		FirstName.sendKeys("Ashwini");
		LastName.sendKeys("Mahure");
		EmailID.sendKeys("ashu@gmail.com");
		ReEnterEmailID.sendKeys("ashu@gmail.com");
		NewPassword.sendKeys("123456789");
		
	Select d=new Select(Day);
	d.selectByIndex(2);
	Select m=new Select(Month);
	m.selectByValue("5");
	Select y=new Select(year);
	y.selectByVisibleText("2004");
	Female.click();
	//Male.click();
	//Custom.click();
	//SignUp.click();
	}
//	public void day()
//	{
//		Day.click();
//		
//	}
//	public void month()
//	{
//		Month.click();
//	}
//	public void year()
//	{
//		year.click();
//	}
	
}
