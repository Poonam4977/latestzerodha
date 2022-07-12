package poonam.aa;

import org.openqa.selenium.WebDriver;

public class MethodsofWebdriver {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("https://vctcpune.com");
		String title=driver.getTitle();
		System.out.println(title);
		String curr=driver.getCurrentUrl();
		System.out.println(curr);
	}

}
