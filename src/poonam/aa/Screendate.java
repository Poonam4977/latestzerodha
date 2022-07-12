package poonam.aa;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screendate {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Screendate.screenwithdate(driver, "name");
		
	
}
	public static void screenwithdate(WebDriver driver,String name) throws IOException
	{
		String t=Screendate.datte();
		File  source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination=new File("D:\\screenshot\\nwscreenshot\\"+name+t+".jpeg");
		FileHandler.copy(source, Destination);
	}
	public static String datte() {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYYY-MMM-dd  HH-MM-SS");
		LocalDateTime cur=LocalDateTime.now();
		String t=dtf.format(cur);
		return t;
	}
	
		
		


}

