package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FriendsPage {

	@FindBy (xpath="//span[text()='Add Friend']")
	private WebElement addFriend;
	@FindBy (xpath="//span[text()='Friend requests']")
	private WebElement friendRequest;
	@FindBy (xpath="//span[text()='All Friends']")
	private WebElement allFriend;
	@FindBy (xpath="//span[text()='Suggestions']")
	private WebElement suggestions;
	
	public FriendsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnAddFriend()
	{
		addFriend.click();
	}
	public void clickOnFriendRequest()
	{
		friendRequest.click();
	}
	public void clickOnAllFriend()
	{
		allFriend.click();
	}
	
	public void clickOnSuggestionList()
	{
		suggestions.click();
	}
}
