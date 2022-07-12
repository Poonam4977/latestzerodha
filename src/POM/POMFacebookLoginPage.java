package POM;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMFacebookLoginPage {
	@FindBy(xpath="//input[@id='email']") private WebElement email;
	@FindBy(xpath="//input[@id='pass']") private WebElement password;
	@FindBy(xpath="//button[@data-testid='royal_login_button']") private WebElement login;
	@FindBy(xpath="//button[text()='Forgotten password?']") private WebElement forgot;
	@FindBy(xpath="//a[@data-testid='open-registration-form-button']") private WebElement create;
	@FindBy(xpath="//a[text()='Create a Page']") private WebElement createpage;
	public POMFacebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Entermail(String EmailID)
	{
		email.sendKeys(EmailID);
	}
	public void Enterpassword(String pass )
	{
		password.sendKeys(pass);
	}
	public void PressLoginButton()
	{
		login.click();
	}
	public void forgotpassword()
	{
		forgot.click();
	}
	public void createnewaccount()
	{
		create.click();
	}
	public void creatapage()
	{
		createpage.click();
	}
}
