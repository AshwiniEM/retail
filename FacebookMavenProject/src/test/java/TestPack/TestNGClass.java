package TestPack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BrowserSetup.Base;
import Pages.HomePage;
import Pages.LoginOrSignUpPage;
import Pages.MessengerPage;
import Pages.RoomsPage;
import utils.Utility;

public class TestNGClass extends Base {
         
	private static final int TestID = 0;
	private WebDriver driver;
	private RoomsPage roomsPage;
	private MessengerPage messengerPage;
	private LoginOrSignUpPage loginOrSignUpPage;
	private Utility utility;
	private  SoftAssert soft;
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			driver= openChromeBrowser();
		}
		if(browserName.equals("Firefox"))
		{
			driver=openFirefoxBrowser();
		}

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void createPOMObjects()
	{
		 loginOrSignUpPage=new LoginOrSignUpPage(driver);
		 messengerPage=new MessengerPage(driver);
		 roomsPage=new RoomsPage(driver);
	     utility=new Utility();
		
	}
	
	@BeforeMethod
	public void goToRoomPage()
	{    
		
		driver.get("https://www.facebook.com/");
		System.out.println("Before Method");
		//loginOrSignUpPage =new LoginOrSignUpPage(driver);
	   // homePage=new HomePage(driver);
		//loginOrSignUpPage.openMessenger();
		//messengerPage.clickOnRoom();
		soft=new SoftAssert();
		

	}
	@Test (priority=1)
	public void LoginApplication() throws IOException
	{    int TestID=222;
	    String data=utility.exclefiledata(2, 0);
		loginOrSignUpPage.senduserName(data);
		String data1=utility.exclefiledata(2, 2);
		loginOrSignUpPage.sendpassword(data1);
		loginOrSignUpPage.clickOnloginButton();
		soft.assertEquals(false, false);
		
		
	}
	@Test(priority=2)
	public void verifyContactToHelpCenterButton() throws IOException
	{ 
		int TestID=102;
		roomsPage.contactTohelpCenter();
		//utility.captureScreenshot(driver, TestID);
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		soft.assertEquals(url, "https://www.messenger.com/help");
		soft.assertEquals(title, "Messenger Help Centre");
		soft.assertAll();
		
	}
	
	@Test(priority=3)
	public void verifyGotoMessengerButton() throws IOException
	{
		int TestID=103;
	    roomsPage.goBackToMessenger();
	  //  utility.captureScreenshot(driver, TestID);
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		soft.assertEquals(url, "https://www.messenger.com/");
		soft.assertEquals(title, "Messenger");
	}
	@AfterMethod
	public void afterMetod(ITestResult result) throws IOException 
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.captureScreenshot(driver, TestID);
		}
		System.out.println("After Method");
		System.out.println("Logout");
	}
	@AfterClass
	public void removeObjects()
	{
		 loginOrSignUpPage=null;
		 messengerPage=null;
		 roomsPage=null;
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
		System.gc();//Garbeg collector
	}
}
