package greenstech;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5selenium {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		/*System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//guru99
		driver.get("http://demo.guru99.com/test/drag_drop.html ");
		
		Actions bank = new Actions(driver);
		bank.dragAndDrop(driver.findElementByXPath("//a[text()=' BANK ']"),driver.findElementById("shoppingCart1")).build().perform();
		
		Actions fivek = new Actions(driver);
		fivek.dragAndDrop(driver.findElementByXPath("//a[text()=' 5000 ']"),driver.findElementById("shoppingCart4")).build().perform();
		
		Actions sales = new Actions(driver);
		sales.dragAndDrop(driver.findElementByXPath("//a[text()=' SALES ']"),driver.findElementById("shoppingCart3")).build().perform();
		
		Actions fivekk = new Actions(driver);
		fivekk.dragAndDrop(driver.findElementByXPath("//a[text()=' 5000 ']"),driver.findElementById("amt8")).build().perform();
		driver.quit();
		
		//driver.quit();
		//Amazon
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver1.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		WebElement Cate = driver1.findElementById("nav-shop");
		Actions fstmouse = new Actions(driver1);
		fstmouse.moveToElement(Cate).build().perform();
	    Thread.sleep(5000);
		
		WebElement secndhover = driver1.findElementByXPath("//span[text()='Mobiles, Computers']");
		Actions mobilehvr = new Actions(driver1);
		mobilehvr.moveToElement(secndhover).perform();
		Thread.sleep(5000);
		
		WebElement powerbank = driver1.findElementByXPath("//span[text()='Power Banks']");
		Actions thirdhvr = new Actions(driver1);
		thirdhvr.moveToElement(powerbank).perform();
		powerbank.click();	
		driver1.quit();
		
		//Greenstechnology
		ChromeDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver2.get("http://www.greenstechnologys.com/selenium-course-content.html");
		Thread.sleep(10000);
		driver2.findElementByXPath("//button[@class='close']").click();
		Thread.sleep(5000);
		
		WebElement courses = driver2.findElementByXPath("//a[text()='COURSES']");
		Actions course = new Actions(driver2);
		course.moveToElement(courses).build().perform();
		
		WebElement sftwre = driver2.findElementByXPath("//span[text()='Software Testing Training ']");
		Actions software = new Actions(driver2);
		software.moveToElement(sftwre).build().perform();
		
		WebElement selenium = driver2.findElementByXPath("//span[text()='Selenium Training']");
		Actions sele = new Actions(driver2);
		sele.moveToElement(selenium).build().perform();
		selenium.click();
		Thread.sleep(10000);
		WebElement sel = driver2.findElementByXPath("//button[@class='close']");
		sel.click();
		
		WebElement para1 = driver2.findElementByXPath("//div[@id='article-wrapper']/p[4]");
		Actions para2 = new Actions(driver2);
		para2.click(para1).doubleClick(para1).build().perform();
		String text1 = para1.getText();
		System.out.println(text1);
		driver2.quit();*/
		
		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver3.get("http://www.greenstechnologys.com/selenium-course-content.html");
		Thread.sleep(10000);
		driver3.findElementByXPath("//button[@class='close']").click();
		Thread.sleep(5000);
		
		//WebElement sell = driver3.findElementByXPath("//button[@class='close']");
		//sell.click();
		//Thread.sleep(5000);
		
		WebElement rightclick = driver3.findElementByXPath("//h1[text()='Selenium Training in Chennai']");
		Actions right = new Actions(driver3);
		//right.moveToElement(rightclick).build().perform();
		right.contextClick(rightclick).build().perform();
		Thread.sleep(5000);
		Robot down = new Robot();
		down.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		down.keyPress(KeyEvent.VK_DOWN);
		down.keyPress(KeyEvent.VK_DOWN);
		down.keyPress(KeyEvent.VK_DOWN);
		down.keyPress(KeyEvent.VK_ENTER);
		down.keyRelease(KeyEvent.VK_DOWN);
		down.keyRelease(KeyEvent.VK_DOWN);
		down.keyRelease(KeyEvent.VK_DOWN);
		down.keyRelease(KeyEvent.VK_DOWN);
		down.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
