package greenstech;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6selenium {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		driver.get("http://www.adactin.com/HotelApp/ ");
		//Thread.sleep(5000);
		WebElement uname = driver.findElementById("username");
		//uname.clear();
		uname.sendKeys("gowtham");
		
		Robot cut = new Robot();
		cut.keyPress(KeyEvent.VK_CONTROL);
		cut.keyPress(KeyEvent.VK_A);
		cut.keyRelease(KeyEvent.VK_CONTROL);
		cut.keyRelease(KeyEvent.VK_A);
		cut.keyPress(KeyEvent.VK_CONTROL);
		cut.keyPress(KeyEvent.VK_C);
		cut.keyRelease(KeyEvent.VK_CONTROL);
		cut.keyRelease(KeyEvent.VK_C);
		
		cut.keyPress(KeyEvent.VK_TAB);
		cut.keyPress(KeyEvent.VK_CONTROL);
		cut.keyPress(KeyEvent.VK_V);
		cut.keyRelease(KeyEvent.VK_CONTROL);
		cut.keyRelease(KeyEvent.VK_V);
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		driver1.get("https://www.google.co.in/webhp ");
		
		driver1.findElementByXPath("//a[@title='Google apps']").click();
	//	Thread.sleep(5000);
		driver1.findElementByXPath("//a[text()='More']").click();
		Thread.sleep(5000);
		WebElement hover = driver1.findElementByXPath("//*[@id='gbwa']/div[2]/ul[2]");
		Actions hover1 = new Actions(driver1);
		hover1.moveToElement(hover).build().perform();
		Thread.sleep(5000);
		//Robot scroll = new Robot();
		//scroll.mouseWheel(25);
		Thread.sleep(5000);
		driver1.findElementByXPath("//*[@id='gb8']/span[2]").click();
		
	}

}
