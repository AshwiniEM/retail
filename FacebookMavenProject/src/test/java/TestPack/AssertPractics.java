package TestPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginOrSignUpPage;
import Pages.MessengerPage;
import Pages.RoomsPage;

public class AssertPractics {

    
	private WebDriver driver;
	private RoomsPage roomsPage;
	private MessengerPage messengerPage;
	SoftAssert soft;
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\Velocity Testing\\\\Chrome new version\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.get("https://www.facebook.com/");
		System.out.println("Before Method");
		LoginOrSignUpPage loginOrSignUpPage=new LoginOrSignUpPage(driver);
		loginOrSignUpPage.openMessenger();
	    messengerPage=new MessengerPage(driver);
		messengerPage.clickOnRoom();
		roomsPage=new RoomsPage(driver);
		soft=new SoftAssert();
	
	}
	@Test(priority=1)
	public void test1()
	{
		System.out.println("test1");
	    roomsPage.goBackToMessenger();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		boolean result=url.equals("https://www.messenger.com/");
		Assert.assertTrue(result);
	//	Assert.assertFalse(result);
//		Assert.assertEquals(url,"https://www.messenger.com/ashu");
//		Assert.assertEquals(title, "Messenger");
		
//		soft.assertEquals(url, "https://www.messenger.com/ashu");
//		System.out.println("end");
//		soft.assertEquals(title, "Messenger");
//		System.out.println("hee");
//		soft.assertAll();
	//	Assert.assertNotEquals(url, "https://www.messenger.com/");

	}
	@Test
	public void test2()
	{ 
		System.out.println("test2");
		//RoomsPage roomsPage=new RoomsPage(driver);
		roomsPage.contactTohelpCenter();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
//		Assert.assertEquals(url, "https://www.messenger.com/help");
//		Assert.assertEquals(title, "Messenger Help Centre");
//	   soft.assertEquals(url,"https://www.messenger.com/help");
//	   soft.assertEquals(title,"Messenger Help Centre");
//	   soft.assertAll();
	}
	
	@AfterMethod
	public void afterMetod()
	{
		System.out.println("After Method");
		System.out.println("Logout");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
		driver.close();
	}
}
