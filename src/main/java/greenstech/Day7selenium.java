package greenstech;

import java.awt.Window;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7selenium {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.greenstechnologys.com/");
		
		File scrshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\gowtham.varadharaj\\Desktop\\sikuli\\test.png");		
	    org.apache.commons.io.FileUtils.copyFile(scrshot, destfile);
		
	    driver.quit();
	    ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver1.get("http://toolsqa.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver1;
		js.executeScript("window.scrollBy(0, 2000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0, -1000)");
		driver1.quit();
		ChromeDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver2.get("http://www.greenstechnologys.com/");
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver2;
		js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		File screensht = ((TakesScreenshot)driver2).getScreenshotAs(OutputType.FILE);
		File Destfile1 = new File("C:\\Users\\gowtham.varadharaj\\Desktop\\sikuli\\review.png");
		FileUtils.copyFile(screensht, Destfile1);
		driver2.quit();
		ChromeDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver3.get("http://www.greenstech.in/selenium-course-content.html");
		WebElement close = driver3.findElementByXPath("//button[@class='close']");
		//close.click();
		if(close.isDisplayed()){
			close.click();
				}
		
		JavascriptExecutor js2 = (JavascriptExecutor)driver3;
		js2.executeScript("window.scrollBy(0,4000)");
		
		
		driver3.findElementByXPath("//a[text()='HTC global services']").click();
		//WebElement element = driver3.findElementById("plugin");
		File Scrnshots = ((TakesScreenshot)driver3).getScreenshotAs(OutputType.FILE);
		//BufferedImage img = ImageIO.read(Scrnshots);
		
		/*Point point = element.getLocation();
		int imgwidth= element.getSize().getWidth();
		int imgheight = element.getSize().getHeight();
		
		int xcord = point.getX();
		int ycord = point.getY();
		
		BufferedImage elescreenshot = img.getSubimage(xcord, ycord, imgwidth, imgheight);
		ImageIO.write(elescreenshot, "png", Scrnshots);*/
		
		File destination = new File("C:\\Users\\gowtham.varadharaj\\Desktop\\sikuli\\review1.png");
		
		FileUtils.copyFile(Scrnshots,destination);
		
	}
	
}
