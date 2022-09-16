package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppom {
	WebDriver driver;
	public Signuppom(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	    @FindBy(xpath="//*[text()='SIGN IN']")
	    WebElement signin;
	    
	    @FindBy(css="a[href='signup.html']")
	    WebElement signup;
	    
	    @FindBy(id="myName")
	    WebElement firstname; 
	    
	    @FindBy(css="input[placeholder='Last Name']")
	    WebElement lastname;
	    
	    @FindBy(css="input[placeholder='Enter Email']")
	    WebElement email;
	    
	    @FindBy(css="input[placeholder='Password']")
	    WebElement singuppassword;
	    
	    @FindBy(css="input[type='date']")
	    WebElement date;
	    
	    @FindBy(css="div[class='col-md-2'] input[name='gender']")
	    WebElement male;
	    
	    @FindBy(css="div[class='col-md-3'] input[name='gender']")
	    WebElement female;
	    
	    @FindBy(css="input[placeholder='91XXXXXXXXXX']")
	    WebElement mobile;
	    
	    @FindBy(css="textarea[placeholder='Short Bio']")
	    WebElement shortbio;
	    
	    @FindBy(xpath="//button[normalize-space()='Register']")
	    WebElement register;
	    
	    public void goTo()
		{
			driver.get("https://mobileworld.banyanpro.com/");
		}
	    public WebElement signinbutton()
		{
			return signin;
		}
	    public WebElement sigupbutton()
	    {
	    	return signup;
	    }
	    public WebElement fname()
		{
			return firstname;
		}
	    public WebElement lname()
		{
			return lastname;
		}
	    public WebElement mail()
	    {
	    	return email;
	    }
	    public WebElement supwd()
	    {
	    	return singuppassword;
	    }
	    public WebElement dob()
	    {
	    	return date;
	    }
	    public WebElement mradio()
	    {
	    	return male;
	    }
	    public WebElement fradio()
	    {
	    	return female;
	    }
	    public WebElement phone()
	    {
	    	return mobile;
	    }
	    public WebElement bio()
	    {
	    	return shortbio;
	    }
	    public WebElement reg()
	    {
	    	return register;
	    }
}
