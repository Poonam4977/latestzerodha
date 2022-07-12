package Test;

import org.openqa.selenium.WebDriver;

import POM.POMFacebooksignUp;
import poonam.aa.Browser;

public class PomSignupFacebook {
	
	public void testing() throws InterruptedException
	{
		WebDriver driver=Browser.openBrowser("https://www.facebook.com/");
		POMFacebooksignUp pm=new POMFacebooksignUp(driver);
		pm.CreateNewAccount();
		Thread.sleep(3000);
		pm.EnterFirst("poonamjj");
		pm.EnterLast("JadhavJagdale");
		pm.EnterEmailId("psjadhav303@gmail.com");
		pm.ConfirmEmailId("psjadhav303@gmail.com");
		pm.EnterPass("mango123321@");
		pm.bir_day("17");
		pm.bir_month(6);
		pm.bir_year("1989");
		pm.optionFemale();
		pm.signup();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		PomSignupFacebook fb=new PomSignupFacebook();
		fb.testing();
	}

}
