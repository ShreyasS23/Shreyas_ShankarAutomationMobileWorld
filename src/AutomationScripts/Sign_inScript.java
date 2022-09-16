package AutomationScripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Signinpom;

public class Sign_inScript {
	@Test(dataProvider="Signin")
	public void signin(String username,String Password) throws Exception
	{

	
		System.setProperty("webdriver.chrome.driver","C:/Users/shreyas.shankar/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	         
			Signinpom page=new Signinpom(driver);
			page.goTo();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			page.signinbutton().click();
			Thread.sleep(2000);
			page.uname().sendKeys(username);
			Thread.sleep(2000);
			page.pwd().sendKeys(Password);
			Thread.sleep(2000);
			driver.close();
		}
	@DataProvider(name="Signin")
	public Object[][] getdata()
	{
		Object [][] data=new Object[2][2];
	  data [0][0]="Shreyas";
	  data [0][1]="Shre@123";
	  
	  data [1][0]="@#$shreyas";
	  data [1][1]="A123456789";
	  return data;
		
	}
}


















	