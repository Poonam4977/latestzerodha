package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
			WebElement dd=	driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s=new Select(dd);
		//s.selectByIndex(2);
		s.selectByValue("option2");//ask question
		//s.selectByVisibleText("Option3");
		
	}

}
