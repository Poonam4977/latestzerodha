package poonam.aa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextgeniaAlert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		WebElement a=driver.findElement(By.xpath("//button[@name='alertbox']"));
		a.click();
		Alert abox=driver.switchTo().alert();
		String aboxtext=abox.getText();
		System.out.println(aboxtext);
		abox.accept();
		WebElement ca=driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
		ca.click();
		//Alert cabox=driver.switchTo().alert();
		String caboxtext=abox.getText();
		System.out.println(caboxtext);
		abox.accept();
		WebElement cca=driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
		cca.click();
	//	Alert ccabox=driver.switchTo().alert();
		
		abox.dismiss();
		WebElement promtca=driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		promtca.click();
		Alert pcabox=driver.switchTo().alert();
		String pcaboxtext=abox.getText();
		System.out.println(pcaboxtext);
		pcabox.sendKeys("YES");
		abox.accept();
		WebElement ppromtca=driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		ppromtca.click();
		//Alert ppcabox=driver.switchTo().alert();
		String ppcaboxtext=abox.getText();
		System.out.println(ppcaboxtext);
		pcabox.sendKeys("NO");
		abox.accept();
		WebElement pppromtca=driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		pppromtca.click();
		//Alert ppcabox=driver.switchTo().alert();
		//String ppcaboxtext=abox.getText();
		System.out.println(ppcaboxtext);
		//pcabox.sendKeys("NO");
		abox.dismiss();
	}

}
