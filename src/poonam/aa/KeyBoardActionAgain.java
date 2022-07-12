package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionAgain {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("https://demoqa.com/text-box");
		Actions action=new Actions(driver);
		WebElement name=driver.findElement(By.xpath("//input[@id='userName']"));
		name.sendKeys("poonam");
		
		action.sendKeys(Keys.TAB);
		action.sendKeys("poonamj@gmail.com");
		action.sendKeys(Keys.TAB);
		action.sendKeys("mumbai");
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
