package datadriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SpecifRowColumn {
	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\specificfile.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Data");

		XSSFRow currentrow = sheet.createRow(3);
		XSSFCell currentcell = currentrow.createCell(4);
		currentcell.setCellValue("Hello");

		wb.write(file);
		wb.close();
		file.close();
		System.out.println("file created..");
	}
}
