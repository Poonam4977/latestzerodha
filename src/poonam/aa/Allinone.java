package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allinone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\velocity softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("velocity");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("katraj");
		WebElement login=driver.findElement(By.tagName("button"));
		login.click();
		/*driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	Dimension d=new Dimension(300, 300);
	driver.manage().window().setSize(d);
     Point p=new Point(700,900);
      driver.manage().window().setPosition(p);
      */
		
		
	}

}
