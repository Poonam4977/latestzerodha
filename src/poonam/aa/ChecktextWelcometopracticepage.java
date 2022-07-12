package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChecktextWelcometopracticepage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		String Expected="Welcome To Practice Page";
		WebElement Actual=driver.findElement(By.xpath("//h1[@class=' header1 font-weight-bold text-white text-center']"));
		
		String Act=Actual.getText();
		if(Expected.equals(Act))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
	}

}
