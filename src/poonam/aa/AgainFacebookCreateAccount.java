package poonam.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AgainFacebookCreateAccount {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement create=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		create.click();
		Thread.sleep(3000);
		WebElement first=driver.findElement(By.xpath("//input[@name='firstname']"));
		first.sendKeys("Harshavardhan");
		WebElement last=driver.findElement(By.xpath("//input[@name='lastname']"));
		last.sendKeys("Chachar");
		WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("psjadhav303@gmail.com");
		WebElement conemail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		conemail.sendKeys("psjadhav303@gmail.com");
		WebElement pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("Harshu7&");
		WebElement selectday=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s=new Select(selectday);
		s.selectByValue("14");
		WebElement selectmonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1=new Select(selectmonth);
		s1.selectByIndex(3);
		WebElement selectyear=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2=new Select(selectyear);
		s2.selectByValue("1989");
		WebElement female=driver.findElement(By.xpath("//input[@class='_8esa']"));
	    female.click();
	    WebElement femaletext=driver.findElement(By.xpath("//input[@class='_8esa']"));
	    //femaletext.click();
	    String f= femaletext.getText();
	    System.out.println(f);
	   /* WebElement male=driver.findElement(By.xpath("//input[@class='_8esa']"));
	    male.click();
	    String m=male.getText();
	    System.out.println(m);
	    WebElement cust=driver.findElement(By.xpath("//input[@class='_8esa']"));
	    cust.click();
	    String c=cust.getText();
	    System.out.println(c);*/
	    WebElement signup=driver.findElement(By.xpath("//button[@name='websubmit']"));
	    signup.click();
	}

}
