package poonam.aa;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RevWinHand {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		WebElement p=driver.findElement(By.xpath("//a[text()='Start Selenium Practice']"));
		String homepageadd=driver.getWindowHandle();
		System.out.println(homepageadd);
		p.click();
		p.click();
		p.click();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String>i=handles.iterator();
		String h1=i.next();
		System.out.println(h1);
		String h2=i.next();
		System.out.println(h2);
		String h3=i.next();
		System.out.println(h3);
		String h4=i.next();
		System.out.println(h4);
		
	}

}
