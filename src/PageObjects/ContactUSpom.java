package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUSpom {
WebDriver driver;
 public ContactUSpom(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 @FindBy(xpath="//body/nav[@id='navbar']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav mx-auto']/li[4]/a[1]")
 WebElement support;
 
 @FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Contact Us']")
 WebElement contactus;
 
 @FindBy(xpath="//input[@placeholder='Username']")
 WebElement cusername;
 
 @FindBy(css="input[placeholder='Email']")
 WebElement cemail;
 
 @FindBy(css="input[placeholder='Phone']")
 WebElement cphone;
 
 @FindBy(css="textarea[placeholder='Message']")
 WebElement cmessage;
 
 @FindBy(css="input[value='Send']")
 WebElement send;
     public void goTo()
	{
		driver.get("https://mobileworld.banyanpro.com/");
	}
   
     public WebElement supdrop()
	{
		return support;
	}
     public WebElement contdrop()
     {
    	 return contactus;
     }
     public WebElement cuname()
     {
    	 return cusername;
     }
     public WebElement cmail()
     {
    	 return cemail;
     }
     public WebElement cphn()
     {
    	 return cphone;
     }
     public WebElement cmsg()
     {
    	 return cmessage;
     }
     public WebElement sd()
     {
    	 return send;
     }
}
