//package readExcelFile;
//
//public class DynamicExcel {
//	
//	public static void readXLs(String testName , String columnName){
//
//		//readXL("TC004" , "Password");
//
//		try {
//			String path = "C:\\Users\\Administrator\\Desktop\\Test001.xls";
//			FileInputStream fis = new FileInputStream(path);
//			Workbook workbook = new HSSFWorkbook(fis);
//			Sheet sheet = workbook.getSheet("Mithun");
//			int lastRow = sheet.getLastRowNum();
////			System.out.println("Last row- " + lastRow);
//			for (int i = 0; i <= lastRow; i++) {
//				Row row = sheet.getRow(i);
//				int lastCell = row.getLastCellNum();
//				Cell cell = row.getCell(0);
//				String value = cell.getStringCellValue();
//				//System.out.println(value);
//				if(value.equals(testName)){
//					Row rownew = sheet.getRow(0);
//					for (int j = 0; j < lastCell; j++) {
//						Cell cellnew = rownew.getCell(j);
//						String valuenew = cell.getStringCellValue();
//						if(cellnew.toString().equals(columnName)) {
//
//							System.out.println(sheet.getRow(i).getCell(j));
//
//						}
//					}
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//
//}
