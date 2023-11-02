package readExcelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.testng.annotations.Test;

public class Excel_SimpleReading {
	@Test
	public void readExcelFile() throws IOException {
		String path = "C:\\Users\\Administrator\\Desktop\\testing.xls";
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = new HSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Ruckumani");
		//System.out.println(sheet.getRow(1).getCell(3));
		
		
		int lastRow = sheet.getLastRowNum();
		System.out.println("Last row- " + lastRow);
		for (int i = 0; i <= lastRow; i++) {
			Row row = sheet.getRow(i);
			
			//If 'i' value is testcase name then capture the row value
			int lastCell = row.getLastCellNum();
			for (int j = 0; j < lastCell; j++) {
				Cell cell = row.getCell(j);
				
				
				//If the value matches the column name capture the column name
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
			System.out.println();

	}
	
	
	
	
	}
	
	@Test
	public void read_excel_aspercondition() {
		readXLs("Smoke_3", "Phone number");
		
	}
	
	public static void readXLs(String testName , String columnName){

		//readXL("TC004" , "Password");

		try {
			String path = "C:\\Users\\Administrator\\Desktop\\testing.xls";
			FileInputStream fis = new FileInputStream(path);
			Workbook workbook = new HSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet("Ruckumani");
			int lastRow = sheet.getLastRowNum();
			System.out.println("Last row- " + lastRow);
			for (int i = 0; i <= lastRow; i++) {
				Row row = sheet.getRow(i);
				int lastCell = row.getLastCellNum();
				Cell cell = row.getCell(0);
				String value = cell.getStringCellValue();
				//System.out.println(value);
				if(value.equals(testName)){
					Row rownew = sheet.getRow(0);
					for (int j = 0; j < lastCell; j++) {
						Cell cellnew = rownew.getCell(j);
						String valuenew = cell.getStringCellValue();
						if(cellnew.toString().equals(columnName)) {

							System.out.println(sheet.getRow(i).getCell(j));

						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
