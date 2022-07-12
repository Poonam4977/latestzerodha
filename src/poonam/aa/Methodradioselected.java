package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Methodradioselected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		WebElement radio2=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		boolean result=radio2.isSelected();
		System.out.println(result);
		radio2.click();
		boolean newresult=radio2.isSelected();
	System.out.println(newresult);
	}

}
