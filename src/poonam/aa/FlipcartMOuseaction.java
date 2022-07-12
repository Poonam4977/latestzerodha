package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipcartMOuseaction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement cancel=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cancel.click();
		WebElement move=driver.findElement(By.xpath("(//div[@class='_28p97w'])[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(move);
		action.perform();
		
	}

}
