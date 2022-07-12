package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		WebElement user=driver.findElement(By.xpath("//input[@id='userName']"));
		user.sendKeys("Poonam");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB);
		action.sendKeys("poonam@gmail.com");
		action.sendKeys(Keys.TAB);
		action.sendKeys("pune");
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.sendKeys(Keys.TAB);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.sendKeys(Keys.TAB);
		action.sendKeys(Keys.ENTER);
		action.build().perform();
	}

}
