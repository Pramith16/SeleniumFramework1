package firstSeleniumTest;

import utils.ExcelUtils;

public class ExcelDemo {
	
	static String proj_path = System.getProperty("user.dir");

	public static void main(String[] args) {
		
		readData();
		
	}
		
		
		public static void readData() {
	
		ExcelUtils readExcel = new ExcelUtils(proj_path+"\\DataFiles\\ExampleData.xlsx", "sheet1");
		
		/*
		 * readExcel.getRowCount();
		 * 
		 * readExcel.getColCount();
		 */
		Object cell_data = readExcel.getCellData(0,1);
		
		System.out.println(cell_data);
		
		}

}
