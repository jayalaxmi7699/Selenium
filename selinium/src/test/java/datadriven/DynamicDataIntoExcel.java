package datadriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicDataIntoExcel {
	// writing data into excel
	// Excel File-->workbook -->sheets -->Rows-->cells
	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\dynamicfile.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("DynamicData");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many rows ?");
		int noOfrows = sc.nextInt();

		System.out.println("Enter how many cells ?");
		int noOfcells = sc.nextInt();

		for (int r = 0; r < noOfrows; r++) {
			XSSFRow currentrow = sheet.createRow(r);
			for (int c = 0; c < noOfcells; c++) {
				XSSFCell currentcell = currentrow.createCell(c);
				currentcell.setCellValue(sc.next());
			}
			
		}
		System.out.println("file created..");
		wb.write(file);
		wb.close();
		file.close();
	}

}
