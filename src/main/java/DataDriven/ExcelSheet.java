package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelSheet {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\gugan\\eclipse-workspace\\MavenProject\\Output\\new.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet creatSheet = book.createSheet("guganOne");
		Row createRow = creatSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Iphone14");
		Cell createCell2 = createRow.createCell(1);
		createCell2.setCellValue("Samsung");
		FileOutputStream out = new FileOutputStream(file);
		book.write(out);
		
		
		File filee = new File("C:\\\\Users\\\\gugan\\\\eclipse-workspace\\\\MavenProject\\\\Output\\\\new.xlsx");
		FileInputStream input = new FileInputStream(filee);
		Workbook book2 = new XSSFWorkbook(input);
		Sheet sheet = book2.getSheet("guganOne");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String cellvalue = cell.getStringCellValue();
		System.out.println(cellvalue);
		
	}
}
