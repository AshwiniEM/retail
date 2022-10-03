package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
  @FindBy (xpath="(//span[@class='om3e55n1'])[1]")
  private  WebElement Home;
  
  @FindBy (xpath="(//span[@class='om3e55n1'])[2]")
  private WebElement Watch;
  
  @FindBy (xpath="(//span[@class='om3e55n1'])[3]")
  private WebElement MarketPlace;
  
  @FindBy (xpath="(//span[@class='om3e55n1'])[4]")
  private WebElement Groups;
  
  @FindBy (xpath="//input[@aria-label='Search Facebook']")
  private WebElement Search;
  
  @FindBy (xpath="//span[text()='Friends']")
  private WebElement Friend;
  
  
  @FindBy (xpath="(//div[@class='i85zmo3j alzwoclg pytsy3co jcxyg2ei h07fizzr'])[1]")
  private WebElement Notification;
  
  @FindBy (xpath="(//div[@class='bdao358l om3e55n1 g4tp4svg'])[3]")
  private WebElement Message;
  
  
  
  public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
  public void home()
	{
		Home.click();	
	}
  public void Watch()
 	{
 		Watch.click();	
 	}
  public void MarketPlace()
 	{
 		MarketPlace.click();	
 	}
  public void Groups()
 	{
 		Groups.click();	
 	}
  public void search()
 	{
 		Search.sendKeys("sunita dhanwate");
 	}
  public void friend()
 	{
 		Friend.click();	
 	}
  public void notifications()
	{
	  Notification.click();	
	}
}
