package TestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginOrSignUpPage;
import Pages.SignUpPage;

public class VerifyCreatNewAccountButton {
public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "E:\\Velocity Testing\\Chrome new version\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			LoginOrSignUpPage loginOrSignUpPage =new LoginOrSignUpPage(driver);
			loginOrSignUpPage.createNewAccount();
			//Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			SignUpPage signUpPage=new SignUpPage(driver);
			signUpPage.createLoginPage();
			signUpPage.SignUp();
			System.out.println("End");
}
}
