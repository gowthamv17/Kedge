package greenstech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Day1selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\gowtham.varadharaj\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gowtham.varadharaj\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver2 = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		
		
	}

}
