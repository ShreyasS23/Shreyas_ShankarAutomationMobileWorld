package AutomationScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Signuppom;

public class Sign_UPScript {
	@Test(dataProvider="Signup")
	public void signup(String firstname,String lastname,String email,String singuppassword,String date,String mobile,String shortbio) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/shreyas.shankar/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     
	     Signuppom spage = new Signuppom(driver);
	     spage.goTo();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     spage.signinbutton().click();
		 Thread.sleep(2000);
		 spage.sigupbutton().click();
		 Thread.sleep(2000);
		 spage.fname().sendKeys(firstname);
		 Thread.sleep(2000);
		 spage.lname().sendKeys(lastname);
	     Thread.sleep(2000);
	     spage.mail().sendKeys(email);
	     Thread.sleep(2000);
	     spage.supwd().sendKeys(singuppassword);
	     Thread.sleep(2000);
	     spage.dob().sendKeys(date);
	     Thread.sleep(2000);
	     spage.mradio().click();
	     Thread.sleep(2000);
	     spage.phone().sendKeys(mobile);
	     Thread.sleep(2000);
	     spage.bio().sendKeys(shortbio);
		 Thread.sleep(1000);
		 spage.reg().click();
		 driver.close();
	}
		 @DataProvider(name="Signup")
			public Object[][] getdata()
			{
			 Object [][] data=new Object[2][7];
			  data [0][0]="Shreyas";
	          data [0][1]="Shankar";
	          data [0][2]="shreyas@gmail.com";
	          data [0][3]="Shre@123";
	          data [0][4]="01/07/1999";
	          data [0][5]="958895579";
	          data [0][6]="I am currently working in Qualitest as Trainee Engineer";
	          
	          data [1][0]="Shreyashshreyash";
	          data [1][1]="Shankar";
	          data [1][2]="shreyasgmailcom";
	          data [1][3]="Shre@123";
	          data [1][4]="01/07/19999";
	          data [1][5]="9588955794545646";
	          data [1][6]="I am currently working in Qualitest as Trainee Engineer";
			  return data;
			 
	         } 	 
}