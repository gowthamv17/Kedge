package greenstech;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excelutils {

	public void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:\\Users\\gowtham.varadharaj\\Desktop\\excel utils\\credentials.xls");
		
		HSSFWorkbook wbook = new HSSFWorkbook(fis);
		HSSFSheet wsheet = wbook.getSheetAt(0);
		int Rowcount = wsheet.getLastRowNum()-wsheet.getFirstRowNum();
		System.out.println(Rowcount);
		
		for(int i=1;i<=Rowcount;i++){
			//Row row = wsheet.getRow(i);
			//System.out.println(row);
			//for(int j=1;j<row.getLastCellNum();j++){
				String username = wsheet.getRow(i).getCell(1).getStringCellValue();
				String password = wsheet.getRow(i).getCell(2).getStringCellValue();
				System.out.println(username);
				System.out.println(password);
			}
				
		}
		
	}


