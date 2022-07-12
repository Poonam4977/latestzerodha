package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("https://www.facebook.com");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("velocity");
		//WebElement email=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		//email.sendKeys("velocity");
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("katraj");
		//WebElement pass=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
		//pass.sendKeys("katraj");
		WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
		login.click();
		//WebElement forgot=driver.findElement(By.linkText("Forgotten password?"));
		//forgot.click();
		//WebElement forgott=driver.findElement(By.partialLinkText("Forgotten "));
		//forgott.click();
		//WebElement create_page =driver.findElement(By.linkText("Create a Page"));
		//create_page.click();
	}
	

}
