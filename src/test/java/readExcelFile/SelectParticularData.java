package readExcelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.testng.annotations.Test;

public class SelectParticularData {
	
	
	@Test
	public void read_excel_aspercondition() throws IOException {
		
		readExcelFile("Smoke_3", "Email");
	}
	
	
	
	public void readExcelFile(String testName, String columnName) throws IOException {
		String path = "C:\\Users\\Administrator\\Desktop\\testing.xls";
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = new HSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Ruckumani");
		//System.out.println(sheet.getRow(1).getCell(3));
		
		
		int lastRow = sheet.getLastRowNum();
		System.out.println("Last row- " + lastRow);
		

		for (int i = 0; i <= lastRow; i++) {
						Row row = sheet.getRow(i);
						int lastCell = row.getLastCellNum();
						Cell cell = row.getCell(0);  //Fixing cell index as 0 because our test cases are mapped in cell 0 then running the row loops
						String value = cell.getStringCellValue();
						//System.out.println(value);
						if(value.equals(testName)){
							Row rownew = sheet.getRow(0);        //Fixing row index as 0 because our columns are mapped in row 0 then running the column loops
							for (int j = 0; j < lastCell; j++) {
								Cell cellnew = rownew.getCell(j);
								String valuenew = cell.getStringCellValue();
								if(cellnew.toString().equals(columnName)) {

							System.out.println(sheet.getRow(i).getCell(j));

								}
							}
						}
					}

}}
