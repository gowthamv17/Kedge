package greenstech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day3selenium {
	public static void main(String[] args) throws InterruptedException{
		
		/*System.setProperty("webdriver.chrome.driver","D:\\Backup 27-09-2017\\gowtham\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.greenstechnologys.com/");
		driver.findElement(By.linkText("CONTACT US")).click();
		driver.findElement(By.id("InputName")).sendKeys("gowtham");
		driver.findElement(By.id("InputEmail1")).sendKeys("gowtham.v17@gamil");
		driver.findElement(By.id("InputSubject")).sendKeys("8870211473");
		
		Select dropdown = new Select(driver.findElement(By.xpath("(//select[@name='courses'])[1]")));
		dropdown.selectByVisibleText("Selenium");
		
		Select dropdown1 = new Select(driver.findElement(By.xpath("(//select[@name='branch'])[1]")));
		dropdown1.selectByIndex(1);
		
		Select dropdown2 = new Select(driver.findElement(By.xpath("(//select[@name='time'])[1]")));
		dropdown2.selectByIndex(2);*/
		
		System.setProperty("webdriver.chrome.driver","D:\\Backup 27-09-2017\\gowtham\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.greenstechnologys.com");
		WebElement text = driver.findElement(By.xpath("//span[text() = 'Greens Technologys Overall Reviews']"));
		String txt = text.getText();
		System.out.println(txt);
		
		WebElement paragraph = driver.findElement(By.xpath("//*[@id='article-wrapper']/p[3]"));
		Actions dummy  =new Actions(driver);
		dummy.click(paragraph).doubleClick(paragraph).build().perform();
		String txt1 = paragraph.getText();
		System.out.println(txt1);
		
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://www.google.com/");
		WebElement textfield = driver1.findElement(By.xpath("//input[@title='Search']"));
		//textfield.click();
		//Thread.sleep(5000);
		textfield.sendKeys("greens velmurugan");
		driver1.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver1.findElement(By.xpath("(//a[@href='http://www.greenstechnologys.com/'])[1]")).click();
		
		WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("http://www.adactin.com/HotelApp/");
		
		WebElement uname = driver2.findElement(By.id("username"));
		uname.sendKeys("gowtham");
		WebElement pword = driver2.findElement(By.id("password"));
		pword.sendKeys("Gautam@123");
		String c =pword.getText();
		System.out.println(c);
		
		
		/*WebElement uname1 = driver2.findElement(By.id("username"));
		String txt3 = uname1.getText();
		System.out.println(txt3);
		WebElement pword1 = driver2.findElement(By.id("password"));
		String txt4 = pword1.getText();
		System.out.println(txt4);*/
		
		
	}
	

}
