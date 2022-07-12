package poonam.aa;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Onceagainscreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=Browser.openBrowser("https://www.google.com/");
		Onceagainscreenshot.screen(driver, "poonam");
		
	}
	public static void screen(WebDriver driver,String s) throws IOException
	{  
		String d=Onceagainscreenshot.ddate();
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\screenshot\\nwscreenshot"+s+d+".jpeg");
		FileHandler.copy(source,dest);
		System.out.println("done");
		
	}
	public static String ddate()
	{
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYYY-MMM-dd HH-MM-SS");
		LocalDateTime f=LocalDateTime.now();
		String d=dtf.format(f);
	
		return d;
		
	}

}
