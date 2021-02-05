package Notify;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {
	public static void main(String[] args) throws Exception {
		String path = ".\\Data\\ABC.xlsx";

		File ff = new File(path);
		FileInputStream fis = new FileInputStream(ff);

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.createSheet("VALIDLOGIN");
		// Sheet sh=wb.getSheet("Sheet1");
		Cell cl = sh.createRow(0).createCell(0);
		cl.setCellValue("USERNAME");
		sh.getRow(0).createCell(1).setCellValue("PASSWORD");
		sh.createRow(1).createCell(0).setCellValue("ADMIN");
		sh.getRow(1).createCell(1).setCellValue("MANAGER");
		FileOutputStream fio = new FileOutputStream(path);
		wb.write(fio);
		System.out.println("done");
		wb.close();

	}
}
