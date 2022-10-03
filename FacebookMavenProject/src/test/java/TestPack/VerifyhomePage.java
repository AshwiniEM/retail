package TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.FriendsPage;
import Pages.HomePage;
import Pages.LoginOrSignUpPage;

public class VerifyhomePage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\\\Velocity Testing\\\\Chrome new version\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	LoginOrSignUpPage loginOrSignUpPage=new LoginOrSignUpPage(driver);
	loginOrSignUpPage.senduserName();
	loginOrSignUpPage.sendpassword();
	loginOrSignUpPage.clickOnloginButton();
	HomePage homePage=new HomePage(driver);
	homePage.friend();
	FriendsPage friendsPage=new FriendsPage(driver);
	friendsPage.clickOnAddFriend();
}
}
