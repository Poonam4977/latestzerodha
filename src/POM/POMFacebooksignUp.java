package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMFacebooksignUp {
	@FindBy(xpath="//a[@data-testid='open-registration-form-button']") private WebElement createaccount;
	@FindBy(xpath="//input[@name='firstname']") private WebElement firstname;
	@FindBy(xpath="//input[@name='lastname']") private WebElement lastname;
	@FindBy(xpath="//input[@name='reg_email__']") private WebElement emailid;
	@FindBy(xpath="//input[@name='reg_email_confirmation__']") private WebElement confirmemailid;
	@FindBy(xpath="//input[@name='reg_passwd__']") private WebElement password;
	@FindBy(xpath="//select[@name='birthday_day']") private WebElement b_day;
	@FindBy(xpath="//select[@name='birthday_month']") private WebElement b_month;
	@FindBy(xpath="//select[@name='birthday_year']") private WebElement b_year;
	@FindBy(xpath="(//input[@type='radio'])[1]") private WebElement female;
	@FindBy(xpath="(//input[@type='radio'])[2]") private WebElement male;
	@FindBy(xpath="(//input[@type='radio'])[3]") private WebElement custom;
	@FindBy(xpath="//button[@name='websubmit']") private WebElement signup;
	
	
	public POMFacebooksignUp(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public void CreateNewAccount()
	{
		createaccount.click();
	}
	
	public void EnterFirst(String first)
	{
		firstname.sendKeys(first);
	}
	public void EnterLast(String last)
	{
		lastname.sendKeys(last);
	}
	public void EnterEmailId(String EmailId)
	{
		emailid.sendKeys(EmailId);
	}
	public void ConfirmEmailId(String EmailIdC)
	{
		confirmemailid.sendKeys(EmailIdC);
	}
	public void EnterPass(String pass)
	{
		password.sendKeys(pass);
	}
	public void bir_day(String day)
	{
		Select s=new Select(b_day);
		s.selectByValue(day);
				
	}
	public void bir_month(int  month)
	{
		Select s=new Select(b_month);
		s.selectByIndex(month);
				
	}
	public void bir_year(String year)
	{
		Select s=new Select(b_year);
		s.selectByValue(year);
				
	}
	public void optionFemale()
	{
		female.click();
				
	}
	/*public void Male()
	{
		male.click();
				
	}
	public void Custom( )
	{
		custom.click();
				
	}*/
	public void signup( )
	{
		signup.click();
				
	}
}

