package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomsPage {

	@FindBy (xpath="//a[text()=' Return to messenger.com ']") 
	private WebElement ReturnToMessage;
	
	@FindBy (xpath="//a[text()=' Visit our help center ']") 
	private WebElement HelpCenter;
	
	public RoomsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 public void goBackToMessenger()
	 {
		 ReturnToMessage.click();
	 }
	 public void contactTohelpCenter()
	 {
		 HelpCenter.click();
	 }
}
