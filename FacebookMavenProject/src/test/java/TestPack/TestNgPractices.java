package TestPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.fail;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgPractices {

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@Test (invocationCount=2,priority=2)
	public void test1()
	{
		System.out.println("test1");
	}
	@Test (priority=1,dependsOnMethods={"test1"})
	public void test2()
	{
		System.out.println("test2");
		
		
	}
	@Test(timeOut=1000)
	public void test3() throws InterruptedException
	{
		System.out.println("test3");
		System.out.println("hii");
	}
	@Test
	public void test4()
	{
		System.out.println("test4");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}

}
