package greenstech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8selenium {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement simplealert = driver.findElementByXPath("//button[@class='btn btn-danger']");
		simplealert.click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		driver.findElementByXPath("//a[text()='Alert with OK & Cancel ']").click();
		
		WebElement cancel = driver.findElementByXPath("//button[text()='click the button to display a confirm box ']");
		cancel.click();
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(5000);
		driver.findElementByXPath("//a[text()='Alert with Textbox ']").click();
		WebElement textalert = driver.findElementByXPath("//button[text()='click the button to demonstrate the prompt box ']");
		Thread.sleep(5000);
		textalert.click();
		
		driver.switchTo().alert().sendKeys("raja");
		driver.switchTo().alert().accept();
		
		
		
	}

}
