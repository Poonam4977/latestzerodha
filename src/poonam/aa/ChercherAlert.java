package poonam.aa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ChercherAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		WebElement E=driver.findElement(By.xpath("//input[@name='alert']"));
		E.click();
		Alert EA=driver.switchTo().alert();
		String EAtext=EA.getText();
		System.out.println(EAtext);
		EA.accept();
		WebElement C=driver.findElement(By.xpath("	//input[@name='confirmation']"));
		C.click();
		String con=EA.getText();
		System.out.println(con);
		EA.accept();
		WebElement CC=driver.findElement(By.xpath("	//input[@name='confirmation']"));
		CC.click();
		EA.dismiss();
		WebElement prompt=driver.findElement(By.xpath("	//input[@name='prompt']"));
		prompt.click();
		
		EA.sendKeys("Heloo");
		Thread.sleep(3000);
		EA.dismiss();
		WebElement promptt=driver.findElement(By.xpath("	//input[@name='prompt']"));
		promptt.click();
	
		EA.sendKeys("Heloo");
		Thread.sleep(3000);
		String p=EA.getText();
		System.out.println(p);
		EA.accept();
		WebElement s=driver.findElement(By.xpath("//button[@class='dropbtn']"));
	      s.click();
		
	      WebElement cher1=driver.findElement(By.xpath("//a[@id='link1']"));
	      cher1.click();
	      WebElement cher2=driver.findElement(By.xpath("//a[@id='link2']"));
	      cher2.click();
	      WebElement cher3=driver.findElement(By.xpath("//a[@id='link3']"));
	      cher3.click();
		
		
		
	
		
	}
	
	

}
