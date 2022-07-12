package poonam.aa;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver openBrowser(String url) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\velocity softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		/*
		 //driver.navigate().to(url);
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		Dimension d=new Dimension(300, 300);
		driver.manage().window().setSize(d);
	     Point p=new Point(700,900);
	      driver.manage().window().setPosition(p);
			*/
		
		return driver;
	}

}
