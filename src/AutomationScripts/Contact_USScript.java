package AutomationScripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.ContactUSpom;

public class Contact_USScript {
	@Test(dataProvider="contactus")
	public void contactus(String cusername,String cemail,String cphone,String cmessage) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/shreyas.shankar/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     
	     ContactUSpom cpage = new ContactUSpom(driver);
	     cpage.goTo();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     cpage.supdrop().click();
	     Thread.sleep(1000);
	     cpage.contdrop().click();
	     Thread.sleep(1000);
	     Set<String> id = driver.getWindowHandles();
	     java.util.Iterator<String> it = id.iterator();
	     String parentId = it.next();
	     String childId = it.next();
	     driver.switchTo().window(childId);
	     driver.manage().window().maximize();
	     cpage.cuname().sendKeys(cusername);
	     Thread.sleep(1000);
	     cpage.cmail().sendKeys(cemail);
	     Thread.sleep(1000);
	     cpage.cphn().sendKeys(cphone);
	     cpage.cmsg().sendKeys(cmessage);
	     Thread.sleep(1000);
	     cpage.sd().click();   
	     driver.close();
	}     
	     @DataProvider(name="contactus")
	     public Object[][] getdata()
	 	{
			 Object [][] data=new Object[2][4];
			  data [0][0]="Shreyas";
	          data [0][1]="shreyas@gmail.com";
	          data [0][2]="9878897866";
	          data [0][3]="HELLO THIS IS THE PAGE FOR CONTACTUS";
	          
	          data [1][0]="Shreyas";
	          data [1][1]="shreyasgmail.com";
	          data [1][2]="98788978669999999999999";
	          data [1][3]="HELLO THIS IS THE PAGE FOR CONTACTUS";
	          return data;
	         
			}
}