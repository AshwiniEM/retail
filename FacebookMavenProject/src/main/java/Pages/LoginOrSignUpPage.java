package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
    //Variable declaration
	@FindBy (xpath="//input[@id='email']") 
	private WebElement userName;
	
	@FindBy (xpath="//input[@id='pass']") 
    private WebElement password;
	
	@FindBy (xpath="//button[@name='login']") 
	private WebElement loginbutton;
	
	@FindBy (xpath="//a[text()='Messenger']") 
	private WebElement messenger;
	
	@FindBy (xpath="//a[text()='Create New Account']") 
	private WebElement createNewAccount;
	
	
	//Variable initialization
	public LoginOrSignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	//Variable use
	public void senduserName(String user)
	{
		userName.sendKeys(user);
	}
	public void sendpassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickOnloginButton()
	{
		loginbutton.click();
	}
	public void openMessenger()
	{
		messenger.click();
	}
	public void createNewAccount()
	{
		createNewAccount.click();
	}
	
	//or
	public void LoginToApplication(String user, String pass)
	{
		userName.sendKeys(user);
		password.sendKeys(pass);
		loginbutton.click();
	}
}
