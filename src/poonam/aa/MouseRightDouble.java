package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightDouble {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\velocity softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act= new Actions(driver);
		act.contextClick(rightclick);
		act.perform();
		
		WebElement dbleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(dbleclick);
		act.perform();
		
		
		
	}

}
