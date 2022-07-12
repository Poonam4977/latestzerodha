package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signupfacebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("https://www.facebook.com/");
		WebElement create_new_account=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		create_new_account.click();	
WebElement first=driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
first.sendKeys("Arrohiaaru");	
		

}
}
