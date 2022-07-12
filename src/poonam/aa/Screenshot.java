package poonam.aa;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=Browser.openBrowser("https://www.facebook.com/");
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination=new File("D:\\screenshot\\fb.jpeg");
		FileHandler.copy(source,Destination);
	}
	
	
	

}
