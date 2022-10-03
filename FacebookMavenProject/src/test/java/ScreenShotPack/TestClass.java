package ScreenShotPack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginOrSignUpPage;
import utils.Utility;

public class TestClass {
	 private WebDriver driver ;
	 private LoginOrSignUpPage loginOrSignUpPage;
	 private HomePage homePage;
	 private Utility utility;

		@BeforeClass
		public void beforeClass()
		{
			System.setProperty("webdriver.chrome.driver", "E:\\\\Velocity Testing\\\\Chrome new version\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		}
		@BeforeMethod
		public void beforeMethod()
		{
			driver.get("https://www.facebook.com/");
			System.out.println("Before Method");
			loginOrSignUpPage =new LoginOrSignUpPage(driver);
		    homePage=new HomePage(driver);
		    utility=new Utility();
		}
		@Test
		public void test1() throws IOException
		{
			 int TestID=101;
			String data=utility.exclefiledata(1, 0);
			loginOrSignUpPage.senduserName(data);
			//System.out.println(data);
			String data1=utility.exclefiledata(1, 1);
			loginOrSignUpPage.sendpassword(data1);
		
			loginOrSignUpPage.clickOnloginButton();
			utility.captureScreenshot(driver, TestID);
			String url=driver.getCurrentUrl();
			String title=driver.getTitle();
			Assert.assertEquals(url, "https://www.facebook.com/", "Url is Not working");
			
			Assert.assertEquals(title, "Facebook");
			 
		}
		@Test
		public void openHomePage()
		{
			//homePage.notifications();
			//homePage.friend();
			homePage.search();
			String url=driver.getCurrentUrl();
			String title=driver.getTitle();
			Assert.assertEquals(url,"https://www.facebook.com/friends");
			Assert.assertEquals(title,"Friends");
			
		}
			@AfterMethod
			public void afterMethod()
			{
				System.out.println("After Method");
				//driver.close();;
			}
			@AfterClass
			public void afterClass()
			{
				//driver.close();
			}
		
}
