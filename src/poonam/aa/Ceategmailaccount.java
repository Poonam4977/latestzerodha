package poonam.aa;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ceategmailaccount {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://support.google.com/mail/answer/56256?hl=en");
		WebElement CNA=driver.findElement(By.xpath("//a[@class='action-button']"));
		CNA.click();
		Set<String>handles=driver.getWindowHandles();
		Iterator<String>i=handles.iterator();
		while(i.hasNext())
		{
			Thread.sleep(3000);
			String s1=i.next();
			driver.switchTo().window(s1);
			String s2=driver.getTitle();
			System.out.println(s2);
			if(s2.equals("Create your Google Account"))
			{
				WebElement first=driver.findElement(By.xpath("//input[@name='firstName']"));
				first.sendKeys("ARROHIPOONAM");
				WebElement last=driver.findElement(By.xpath("//input[@name='lastName']"));
				last.sendKeys("JADHAV");
				WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
				email.sendKeys("AAROHIPOONAM");
				WebElement pass=driver.findElement(By.xpath("//input[@type='email']"));
				pass.sendKeys("AAROHIPOONAM@1");
				WebElement passcon=driver.findElement(By.xpath("//input[@type='email']"));
				passcon.sendKeys("AAROHIPOONAM@1");
				WebElement signin=driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[3]"));
				signin.click();
			}
			
		}
		
		
		
	}

}
