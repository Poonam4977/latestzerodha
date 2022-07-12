package poonam.aa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alertvctc {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		WebElement al=driver.findElement(By.xpath("//input[@id='alertbtn']"));
		al.click();
		Alert a=driver.switchTo().alert();
		String salert=a.getText();
		System.out.println(salert);
		Thread.sleep(2000);
		a.accept();
		
	}

}
