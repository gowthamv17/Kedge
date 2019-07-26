package greenstech;

import java.awt.Window;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Day9selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.gettyimages.in/");
		WebElement dropdown =driver.findElementByXPath("//div[text()='Creative Images']");
		dropdown.click();
		driver.findElementByXPath("//label[text()='Video']").click();
		driver.quit();
		
		
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver1.get("http://demo.automationtesting.in/Register.html");
		List<WebElement> dd2 = driver1.findElementsById("Skills");
		for(WebElement dd3 : dd2)
		{
			String text = dd3.getText();
		System.out.println(text);
		
		}
		driver1.quit();
		
		
		ChromeDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver2.get("https://www.toolsqa.com/automation-practice-form/?firstname=&lastname=&photo=&continents=Asia&selenium_commands=Browser+Commands&submit=");
		Thread.sleep(5000);
		JavascriptExecutor js = ((JavascriptExecutor)driver2);
		js.executeScript("window.scrollBy(0,1000)");
		//WebElement cmd = driver2.findElementById("selenium_commands");
		//Select commands = new Select(cmd);
		List<WebElement> dd = driver2.findElementsById("selenium_commands");
		for(int i=1; i<=dd.size();i++){
			if(i%2==0){
				
		String texts = dd.get(i).getText();
		System.out.println(texts);
		}
		}
		/*ChromeDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver3.get("https://www.toolsqa.com/automation-practice-form/?firstname=&lastname=&photo=&continents=Asia&selenium_commands=Browser+Commands&submit=");
		Thread.sleep(5000);
		List<WebElement> dd1 = driver3.findElementsById("continents");
		for(WebElement dd4 : dd1){
			String text1 = dd4.getText();
			System.out.println(text1);*/
		}
	}


