package poonam.aa;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table1 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement>heading=driver.findElements(By.xpath("//table//thead//tr//th"));
		int cols=heading.size();
		for(int i=0;i<cols;i++)
		{
			System.out.println(heading.get(i).getText());
		}
		
	}

}
