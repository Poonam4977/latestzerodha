package poonam.aa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table2min {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> row=driver.findElements(By.xpath("//table//tbody//tr"));
		int rowSize=row.size();
		double minPrice=100;
		for(int i=1;i<=rowSize;i++)
		{
			WebElement currentPrice=driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[4]"));
			String price=currentPrice.getText();
			double d=Double.parseDouble(price);
		   if(d<minPrice)
		   {
			   minPrice=d;
		   }
		}
		System.out.println(minPrice);
		
	
	}
}
