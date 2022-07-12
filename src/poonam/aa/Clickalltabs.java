package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Clickalltabs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("https://vctcpune.com/");
		WebElement practice=driver.findElement(By.xpath("//a[@href='../selenium/practice.html']"));
		Thread.sleep(3000);
		practice.click();
		Thread.sleep(3000);
		WebElement about=driver.findElement(By.xpath("//a[@href='https://vctcpune.com/']"));//not working
        about.click();
		
		
	}

}
