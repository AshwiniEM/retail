package TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginOrSignUpPage;
import Pages.MessengerPage;
import Pages.RoomsPage;

public class VerifyContactToHelpCenter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Velocity Testing\\\\Chrome new version\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		LoginOrSignUpPage loginOrSignUpPage=new LoginOrSignUpPage(driver);
		loginOrSignUpPage.openMessenger();
		
		MessengerPage messengerPage=new MessengerPage(driver);
		messengerPage.clickOnRoom();
		
		RoomsPage roomsPage=new RoomsPage(driver);
		roomsPage.contactTohelpCenter();
		
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		
		if(url.equals(url)&&(title.equals(title)))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	
	}
}
