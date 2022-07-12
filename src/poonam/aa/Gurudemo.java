package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gurudemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("http://demo.guru99.com/test/radio.html");
		WebElement selenium=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		selenium.click();
		Thread.sleep(2000);
		WebElement ins_prj=driver.findElement(By.xpath("//a[@href='http://demo.guru99.com/insurance/v1/index.php']"));
		ins_prj.click();
		Thread.sleep(2000);
		WebElement agile_prj=driver.findElement(By.xpath("//a[@href='http://demo.guru99.com/Agile_Project/Agi_V1/']"));
		agile_prj.click();
		Thread.sleep(2000);
		WebElement bank_prj=driver.findElement(By.xpath("//a[@href='http://demo.guru99.com/V1/index.php']"));
		bank_prj.click();
		Thread.sleep(2000);
		WebElement sec_prj=driver.findElement(By.xpath("//a[@href='http://demo.guru99.com/Security/SEC_V1/index.php']"));
		sec_prj.click();
		Thread.sleep(2000);
		WebElement tele_prj=driver.findElement(By.xpath("//a[@href='http://demo.guru99.com/telecom/index.html']"));
		tele_prj.click();
		Thread.sleep(2000);
		WebElement pay_prj=driver.findElement(By.xpath("//a[@href='http://demo.guru99.com/payment-gateway/index.php']"));
		pay_prj.click();
		Thread.sleep(2000);
		WebElement SEO_prj=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		SEO_prj.click();
		Thread.sleep(2000);
	}

}
