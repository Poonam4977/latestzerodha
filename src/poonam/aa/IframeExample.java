package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@name='iframe-name']"));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		WebElement course1=driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
		course1.click();
		//Thread.sleep(3000);
		//WebElement course=driver.findElement(By.xpath("(//a[@href='https://vctcpune.com/courses/'])[1]"));
		//course.click();
}
}
