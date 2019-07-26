package greenstech;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver1.get("https://www.hdfcbank.com/htdocs/common/NetBanking/logout.html?id=tudMR5MNIXhpCithwEbZ6g%3D%3D");
		driver1.findElementByXPath("//a[text()='hdfcbank.com']").click();
		String Mainwindow = driver1.getWindowHandle();
		System.out.println(Mainwindow);

		Set<String> allwindows = driver1.getWindowHandles();
		for(String allwindows1 : allwindows ){
			if(!Mainwindow.equals(allwindows1)){
			driver1.switchTo().window(allwindows1);
			
		
			Thread.sleep(5000);
			try{
		driver1.findElementByXPath("//img[@class='popupCloseButton']").click();
			}
			catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println(e);
				
			}
		
		Thread.sleep(5000);
		
		driver1.findElementById("loginsubmit").click();
		String childwindow = driver1.getWindowHandle();
		System.out.println(childwindow);
		
		Set<String> handles = driver1.getWindowHandles();
		for(String handles1 : handles){
			if(!Mainwindow.equals(handles1)){

			    if(!childwindow.equals(handles1)){
			
				driver1.switchTo().window(handles1);
				driver1.manage().window().maximize();
				System.out.println(handles1);
				Thread.sleep(2000);
				WebElement netbanking = driver1.findElementByXPath("//a[text()='Continue to NetBanking']");
				JavascriptExecutor js = (JavascriptExecutor)driver1;
				js.executeScript("arguments[0].click();", netbanking);
				
			}
		}
		}
		
	}
		}
	}

}
