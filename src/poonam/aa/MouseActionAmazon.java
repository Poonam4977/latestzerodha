package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionAmazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement signin=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions action=new Actions(driver);
		action.moveToElement(signin);
		action.perform();
		WebElement account=driver.findElement(By.xpath("//span[text()='Your Account']"));
		account.click();
		driver.navigate().back();
	}

}
