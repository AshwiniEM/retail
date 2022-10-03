package TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginOrSignUpPage;
import Pages.MessengerPage;
import Pages.RoomsPage;

public class VerifyReturnToMessengerButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Velocity Testing\\\\Chrome new version\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		LoginOrSignUpPage loginOrSignUpPage=new LoginOrSignUpPage(driver);
		loginOrSignUpPage.openMessenger();
		
		MessengerPage messengerPage=new MessengerPage(driver);
		messengerPage.clickOnRoom();
		
		RoomsPage roomsPage=new RoomsPage(driver);
		roomsPage.goBackToMessenger();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		if(url.equals("https://www.messenger.com/")&&(title.equals("Messenger")))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
