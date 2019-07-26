package greenstech;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		String baseUrl= "http://kedge.srinsofttech.com/#/kn-pages/auth/login";
		String desiredTitle="Kedge 2.0";
		String actualTitle="";
		String tagName="";
		driver.get(baseUrl);
		actualTitle= driver.getTitle();
		if 
		(actualTitle.contentEquals(desiredTitle))
		{
			System.out.println("Its pass da dude");
		}
		else
		 {
			System.out.println("damn fail"); 
		 }
		
		WebElement Employeeid = driver.findElementById("mat-input-0");
		Employeeid.clear();
		Thread.sleep(5000);
		Employeeid.sendKeys("SS790");
}
}
