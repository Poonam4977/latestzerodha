package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebookoperation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("poonamjagdale95@gmail.com");
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("manngeet");
		WebElement login=driver.findElement(By.className("_6ltg"));
		login.click();
		WebElement lasttab=driver.findElement(By.xpath("(//div[@class='j83agx80 l9j0dhe7']"));//not working
		lasttab.click();
		
	}

}
