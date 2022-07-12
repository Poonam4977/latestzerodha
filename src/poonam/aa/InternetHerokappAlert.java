package poonam.aa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InternetHerokappAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement jsalert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		jsalert.click();
		Alert jsalert1=driver.switchTo().alert();
		String jstext=jsalert1.getText();
		System.out.println(jstext);
		 jsalert1.accept();
		
		 WebElement jsconfirm=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		 jsconfirm.click();
		 Alert jsconfirm1=driver.switchTo().alert();
		 jsconfirm1.accept();
		 WebElement jsconfirmagain=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		 jsconfirmagain.click();
		 String jsconfirmtext=jsconfirm1.getText();
		 System.out.println(jsconfirmtext);
		 Alert jsconfirm2=driver.switchTo().alert();
		 jsconfirm2.dismiss();
		 WebElement jsprompt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		 jsprompt.click();
		 Alert promp1=driver.switchTo().alert();
		 Thread.sleep(3000);
		 String prompttext=promp1.getText();
			System.out.println(prompttext); 
			Thread.sleep(3000);
			promp1.sendKeys("Hello all");
			promp1.accept();
	}

}
