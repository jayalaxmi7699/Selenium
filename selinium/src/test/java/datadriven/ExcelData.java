package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	// Excel File-->workbook -->sheets -->Rows-->cells
	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Course data.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int totalrows = sheet.getLastRowNum();
		int totalcells = sheet.getRow(1).getLastCellNum();
		System.out.println("No.of rows: "+totalrows); //5
		System.out.println(" No.of cells: "+ totalcells); //4

		for (int r = 0; r <= totalrows; r++) {
			XSSFRow currentRow = sheet.getRow(r);
			
			for (int c = 0; c < totalcells; c++) {
				XSSFCell currentCell = currentRow.getCell(c);
				System.out.print(currentCell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}
