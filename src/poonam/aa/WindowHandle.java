package poonam.aa;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("https://vctcpune.com/");
				WebElement p=driver.findElement(By.xpath("//a[text()='Start Selenium Practice']"));
				p.click();
				p.click();
				p.click();
				String homepage=driver.getWindowHandle();
				System.out.println(homepage);
				Set<String> handles=driver.getWindowHandles();
				Iterator<String>i=handles.iterator();
				String handle1=i.next();
				System.out.println(handle1);
				String handle2=i.next();
				System.out.println(handle2);
	            String handle3=i.next();
	            System.out.println(handle3);
	            String handle4=i.next();
	            System.out.println(handle4);
	}
}
