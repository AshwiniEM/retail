package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessengerPage {
	
	@FindBy (xpath="//a[text()='Rooms']") 
	private WebElement Rooms;
	
	@FindBy (xpath="//a[text()='Features']") 
	private WebElement Features;
	
	//a[text()='Features']
	public MessengerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnRoom()
	{
		Rooms.click();
	}
	public void clickOnFeatures()
	{
		Features.click();
	}
}
