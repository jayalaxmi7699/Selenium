package datadriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataIntoExcel {
	// writing data into excel
	// Excel File-->workbook -->sheets -->Rows-->cells
	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Data");

		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue(123);
		row1.createCell(2).setCellValue("Automation");

		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("C#");
		row2.createCell(1).setCellValue(223);
		row2.createCell(2).setCellValue("Development");

		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("Phyton");
		row3.createCell(1).setCellValue(323);
		row3.createCell(2).setCellValue("Manual");

		XSSFRow row4 = sheet.createRow(3);
		row4.createCell(0).setCellValue("C++");
		row4.createCell(1).setCellValue(423);
		row4.createCell(2).setCellValue("Automation");

		wb.write(file);
		wb.close();
		file.close();
	}

}
