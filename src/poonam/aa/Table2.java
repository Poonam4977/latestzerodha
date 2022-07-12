package poonam.aa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table2 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> row=driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
		int rowSize=row.size();
		double maxPrice=0;
		for(int i=0;i<rowSize;i++)
		{
			
			WebElement currentPrice=row.get(i);
			String price=currentPrice.getText();
			double d=Double.parseDouble(price);
		   if(d>maxPrice)
		   {
			   maxPrice=d;
		   }
		}
		System.out.println(maxPrice);
		
		for(int i=0;i<rowSize;i++)
		{
			
			WebElement currentPrice=row.get(i);
			String price=currentPrice.getText();
			double d=Double.parseDouble(price);
		   if(d<maxPrice)
		   {
			   maxPrice=d;
		   }
		}
		System.out.println(maxPrice);
	}

}
