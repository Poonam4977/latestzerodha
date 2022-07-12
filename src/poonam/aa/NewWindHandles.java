package poonam.aa;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewWindHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("https://vctcpune.com/");
		WebElement p=driver.findElement(By.xpath("//a[text()='Start Selenium Practice']"));
		p.click();
		p.click();
		p.click();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String>i=handles.iterator();
		while(i.hasNext())
		{
			Thread.sleep(3000);
			String h1=i.next();
			driver.switchTo().window(h1);
			String title=driver.getTitle();
			if(title.equals("Practice Page"))
			{
				WebElement r2=driver.findElement(By.xpath("//input[@value='Radio2']"));
				r2.click();
			}
			
		}
		
		
		
	}

}
