package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HideDisplaywebelement {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\velocity softwares\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	String s=driver.getTitle();
	System.out.println(s);
	WebElement data=driver.findElement(By.xpath("//input[@id='displayed-text']"));
	boolean status=data.isDisplayed();
	System.out.println(status);
	//String st=data.getText();I want the text that is written in the textbox
	//System.out.println(st);
	Thread.sleep(3000);
	WebElement hide=driver.findElement(By.xpath("//input[@id='hide-textbox']"));
	hide.click();
	boolean status1=data.isDisplayed();

	System.out.println(status1);
WebElement show=driver.findElement(By.xpath("//input[@id='show-textbox']"));
Thread.sleep(3000);
	show.click();
	boolean status2=data.isDisplayed();
	System.out.println(status2);
}
}
