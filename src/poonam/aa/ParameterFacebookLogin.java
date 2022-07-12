package poonam.aa;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParameterFacebookLogin {
public static void main(String args[]) throws EncryptedDocumentException, IOException
{
	System.setProperty("webdriver.chrome.driver", "D:\\velocity softwares\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String EmailID=Parametrization.getData("FETCH", 1, 1);
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys(EmailID);
	String password=Parametrization.getData("FETCH", 2, 1);
	WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
	pass.sendKeys(password);	
	
	
	}

}
