package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginnewidcreatedjustnow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Aarupoonam");
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("aarupassjadhav@1");
		WebElement login=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		login.click();
		
	}

}
