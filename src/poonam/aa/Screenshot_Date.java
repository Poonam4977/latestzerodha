package poonam.aa;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public  class Screenshot_Date {
	public static void screenshot(WebDriver driver,String name) throws IOException
	{
		String d=Screenshot_Date.date();
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\screenshot\\"+name+ d+".jpeg");
		FileHandler.copy(source, destination);
	}
	public static String date() {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYYY-MMM-dd HH-mm-ss");
		LocalDateTime cur=LocalDateTime.now();
		String d=dtf.format(cur);
		return d;
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=Browser.openBrowser("https://www.facebook.com/");
		Screenshot_Date.screenshot(driver, "nw" );
		
	}
}
