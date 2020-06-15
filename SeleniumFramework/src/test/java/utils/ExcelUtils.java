package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {

	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFCell cell;

	/*
	 * public static void main(String[] args) {
	 * 
	 * //getRowCount();
	 * 
	 * getCellData(1,1);
	 * 
	 * }
	 */



	public ExcelUtils(String excelPath, String sheetName) {

		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void getRowCount() {

		int total_rows = sheet.getLastRowNum() + 1;

		System.out.println("Total number of rows : > "+ total_rows );

	}


	public static void getColCount() {

		int columnCount = sheet.getRow(0).getLastCellNum()+1;

		System.out.println("Total number of rows : > "+ columnCount );

	}

	public static Object getCellData(int rownum, int colnum) {

		Object cell_data = null;

		cell =sheet.getRow(rownum).getCell(colnum);

		if(cell.getCellType().equals("STRING")) {

			String Scell_data = cell.getStringCellValue();

			cell_data = Scell_data;

		}else if (cell.getCellType().equals("NUMERIC") ) {

			System.out.println(cell.getCellType());

			double Ncell_data = cell.getNumericCellValue();

			cell_data = Ncell_data;
		}


		return cell_data;
	}

}
