package greenstech;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		/*ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		java.util.List<WebElement> tables = driver.findElementsByXPath("//table[@summary='Sample Table']");
	    java.util.List<String> table = new ArrayList<String>();
		for(WebElement t1 : tables){
			
			String text = t1.getText();
			//System.out.println(text);
			table.add(text);
			System.out.println(table);
		}
		driver.quit();*/
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver1.get("http://toolsqa.com/automation-practice-table/");
		Thread.sleep(5000);
		List<WebElement> country = driver1.findElementsByXPath("//*[@id='content']/table/tbody/tr[4]");
		//List<String> countries = new ArrayList<String>();
		for(WebElement c1 : country){
			String text1 = c1.getText();
			System.out.println(text1);
			if(text1.equals("China")){
				List<WebElement> rank = driver1.findElementsByXPath("//th[text()='Rank']");
				for(WebElement rank1 : rank){
					String Text2 = rank1.getText();
					System.out.println(Text2);
				}
				
			}
		}
	
		driver1.quit();
	}

}
