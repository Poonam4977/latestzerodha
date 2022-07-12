package poonam.aa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompleteDragandDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Actions action=new Actions(driver);
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		List<WebElement>image=driver.findElements(By.xpath("(//li[contains(@class,'ui-widget-content ')])"));
		WebElement trash=driver.findElement(By.xpath("//div[@id='trash']"));
	
		
		for(int i=0;i<image.size();i++)
		{
			WebElement picture=image.get(i);
			Thread.sleep(2000);
			action.dragAndDrop(picture,trash);
			action.perform();
		}
			
		

}
}
