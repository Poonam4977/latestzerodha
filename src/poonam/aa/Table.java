package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		WebElement preClose=driver.findElement(By.xpath("//table//tbody//tr[6]//td[3]"));
		String p=preClose.getText();
		System.out.println(p);
		
	}

}
