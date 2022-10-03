package TestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginOrSignUpPage;
import Pages.MessengerPage;
import Pages.RoomsPage;


public class TestNGForLogin {
 private WebDriver driver ;
 private LoginOrSignUpPage loginOrSignUpPage;
 private HomePage homePage;

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
		loginOrSignUpPage =new LoginOrSignUpPage(driver);
	    homePage=new HomePage(driver);
		
	}
	@Test
	public void test1()
	{
		
		//loginOrSignUpPage.senduserName();
		//loginOrSignUpPage.sendpassword();
		loginOrSignUpPage.clickOnloginButton();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		Assert.assertEquals(url, "https://www.facebook.com/", "Url is Not working");
		Assert.assertEquals(title, "Facebook");
	}
	@Test
	public void openHomePage() throws InterruptedException
	{
		Thread.sleep(2000);
		homePage.friend();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		Assert.assertEquals(url,"https://www.facebook.com/friends");
		Assert.assertEquals(title,"Friends");
		
	}
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("After Method");
		}
	
	
		
	}

