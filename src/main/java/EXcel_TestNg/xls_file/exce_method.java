package EXcel_TestNg.xls_file;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class exce_method {
	String[][] arr = new String[11][2];

	String[][] method() throws BiffException, IOException {
		// public static void main(String[] args) throws BiffException, IOException {

		String data;
		// File class is
		File file = new File("C:\\Users\\ajith.periyasamy\\Downloads\\Book.xls.xls");
		// Excel file can access by the using the workbook class
		Workbook workbook = Workbook.getWorkbook(file);
		// sheet using to get the sheets of the Book.xlsx file
		Sheet sheet = workbook.getSheet(0);
		// get the row count and column count
		int colCount = sheet.getColumns();
		int rowCount = sheet.getRows();
		// for loop for the access the Excel file using the row and column index
		for (int initial = 0; initial < rowCount; initial++) {
			for (int Count = 0; Count < colCount; Count++) {
				// Get the content of the sheet using getcell() and getcontent() methods
				data = sheet.getCell(Count, initial).getContents();
				arr[initial][Count] = data;
			}
		}

		workbook.close();
		return arr;

	}

}
