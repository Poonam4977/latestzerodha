package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class create_new_fb_account {
	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver=Browser.openBrowser("https://www.facebook.com/r.php");
	      WebDriver driver=Browser.openBrowser("https://www.facebook.com/");
		
		WebElement create_new_account=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		create_new_account.click();	
		Thread.sleep(5000);
	    WebElement first=driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
	    first.sendKeys("Aarupoonam");	
	  WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
	    surname.sendKeys("Jadhavaaru");
	    WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	    email.sendKeys("aarohijadhav391@gmail.com");
	    WebElement emailcon=driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[4]"));
	    emailcon.sendKeys("aarohijadhav391@gmail.com");
	    WebElement pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	    pass.sendKeys("aarupassjadhav@1");
	    Select day = new Select(driver. findElement(By. xpath("//select[@id='day']")));
	    day.selectByValue("16");
	    Select month = new Select(driver. findElement(By. xpath("//select[@id='month']")));
	    month.selectByIndex(5);
	    Select year = new Select(driver. findElement(By. xpath("//select[@id='year']")));
	    year.selectByValue("1989");
	    WebElement radio1=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	    radio1.click();
	  //  WebElement radio2=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	    //radio1.click();
	   // WebElement radio3=driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
	  //  radio1.click();
	   // WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
	    WebElement signup=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	    signup.click();
	  

	   
	}
	
	

}
