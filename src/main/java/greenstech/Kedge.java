package greenstech;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kedge {

	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Backup 27-09-2017\\gowtham\\eclipse\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://kedge.srinsofttech.com/#/kn-pages/auth/login");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        FileInputStream fis = new FileInputStream("C:\\Users\\gowtham.varadharaj\\Desktop\\excel utils\\credentials.xls");
		
		HSSFWorkbook wbook = new HSSFWorkbook(fis);
		HSSFSheet wsheet = wbook.getSheetAt(0);
		int Rowcount = wsheet.getLastRowNum()-wsheet.getFirstRowNum();
		System.out.println(Rowcount);
		for(int i=1;i<=Rowcount;i++){
			//Row row = wsheet.getRow(i);
			//System.out.println(row);
			//for(int j=1;j<row.getLastCellNum();j++){
			if(i==2){
				String username = wsheet.getRow(i).getCell(1).getStringCellValue();
				String password = wsheet.getRow(i).getCell(2).getStringCellValue();
			
		//username}
		WebElement uname = driver.findElementById("mat-input-0");
		uname.clear();
		uname.sendKeys(username);
		//password
		WebElement pword = driver.findElementById("mat-input-1");
		pword.clear();
		pword.sendKeys(password);
		}
			}
		//login
		WebElement login = driver.findElementByXPath("//span[text()=' LOGIN ']");
		login.click();
		Thread.sleep(5000);
		
		//previous week
		//driver.findElementByXPath("//div[text()='Previous Week']").click();
		
		//search
		WebElement search = driver.findElementById("search");
		search.click();
		search.sendKeys("disney");
		
		List<WebElement> DTProjects = driver.findElementsByXPath("//tbody[@class='ng-tns-c14-951 ng-untouched ng-pristine ng-valid']");
		for(int i=1 ; i<=DTProjects.size();i++)
		{
			String text = DTProjects.get(i).getText();
			System.out.println(text);
		}
		
		Thread.sleep(10000);
		//logout
		WebElement logout = driver.findElementByXPath("//mat-icon[text()='keyboard_arrow_down']");
		logout.click();
		
		driver.findElementByXPath("//mat-icon[text()='exit_to_app']").click();
	}


}
