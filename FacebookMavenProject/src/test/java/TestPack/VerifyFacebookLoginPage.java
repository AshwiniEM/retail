package TestPack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginOrSignUpPage;
import utils.Utility;

public class VerifyFacebookLoginPage {
	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver", "E:\\Velocity Testing\\Chrome new version\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Utility utility=new Utility();
			int TestID=111;
			LoginOrSignUpPage loginOrSignUpPage=new LoginOrSignUpPage(driver);
			String data=utility.exclefiledata(2, 0);
			
			loginOrSignUpPage.senduserName(data);
			utility.captureScreenshot(driver, TestID);
			String data1=utility.exclefiledata(1, 3t);
			loginOrSignUpPage.sendpassword(data1);
			utility.captureScreenshot(driver, TestID);
			loginOrSignUpPage.clickOnloginButton();
			utility.captureScreenshot(driver, TestID);
	}
}
