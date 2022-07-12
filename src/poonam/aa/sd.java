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

public class sd {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		sd.shotdate(driver,"poonam");
		
	}

	public static void shotdate(WebDriver driver, String name) throws IOException {
	     String t=sd.dd();
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\screenshot\\"+name+t+".jpeg");
		FileHandler.copy(source, dest);
		
		
	}

	public static String dd() {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYYY-MMM-dd HH-mm-ss");
		LocalDateTime c=LocalDateTime.now();
		String t=dtf.format(c);
		return t;
	}

}
