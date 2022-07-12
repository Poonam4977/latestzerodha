package Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.POMFacebookLoginPage;
import poonam.aa.Browser;
import poonam.aa.MethodsofWebdriver;
import poonam.aa.Screenshot_Date;

public class LoginPageTest {
	WebDriver driver;
	@BeforeMethod
	public void launchbrowser() throws InterruptedException
	{
		driver=Browser.openBrowser("https://www.facebook.com/");
	}
	
	
	@Test
	public void logintest() throws InterruptedException
	{
		
		POMFacebookLoginPage F=new POMFacebookLoginPage(driver);
		F.Entermail("poonamjagdale95@gmail.com");
		F.Enterpassword("manngeet");
		F.PressLoginButton();
	}
	@Test
	public void logintestwithoutpass() throws InterruptedException
	{
		
		POMFacebookLoginPage F=new POMFacebookLoginPage(driver);
		F.Entermail("poonamjagdale95@gmail.com");
	
		F.PressLoginButton();
		

}
	@AfterMethod 
	public void afterMethod() throws IOException{
		Screenshot_Date.screenshot(driver, "LoginPageTest" );
		
	}
	@Test
	public void trial()
	{
		
	}

}





	
