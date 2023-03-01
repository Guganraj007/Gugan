package Class;

import java.io.File; 
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	

	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\gugan\\eclipse-workspace\\MavenProject\\Output\\new.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet createSheet = book.createSheet("Gugan");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Samsung");
		FileOutputStream out = new FileOutputStream(file);
		book.write(out);
		
		
		
//		createSheet = book.createSheet("Gugan");
//		Row createRow = createSheet.createRow(0);
//		Cell createCell = createRow.createCell(0);
//		createCell.setCellValue("Washing machine");
//		Row createRow2 = createSheet.createRow(1);
//		Cell createCell2 = createRow2.createCell(1);
//		createCell2.setCellValue("LED TV");
//		FileOutputStream out = new FileOutputStream(file);
//		book.write(out);
		
		
		
		
	}
}
