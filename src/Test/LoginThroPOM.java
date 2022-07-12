package Test;

import org.openqa.selenium.WebDriver;

import POM.POMFacebookLoginPage;
import poonam.aa.Browser;

public class LoginThroPOM {
	public void logintest() throws InterruptedException
	{
		WebDriver driver=Browser.openBrowser("https://www.facebook.com/");
		POMFacebookLoginPage F=new POMFacebookLoginPage(driver);
		F.Entermail("poonamjagdale95@gmail.com");
		F.Enterpassword("manngeet");
		F.PressLoginButton();
	}
	public void logintestwithoutpass() throws InterruptedException
	{
		WebDriver driver=Browser.openBrowser("https://www.facebook.com/");
		POMFacebookLoginPage F=new POMFacebookLoginPage(driver);
		F.Entermail("poonamjagdale95@gmail.com");
	
		F.PressLoginButton();
		

}
	public static void main(String[] args) throws InterruptedException {
		LoginThroPOM LP=new LoginThroPOM();
		LP.logintest();
		LP.logintestwithoutpass();
	}
}
