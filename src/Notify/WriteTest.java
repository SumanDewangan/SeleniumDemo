package Notify;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteTest 
{
    public static void main(String[] args) throws Exception
    {
	    FileInputStream fis=new FileInputStream("‪D:\\Write.xlsx");
	    Workbook wb=WorkbookFactory.create(fis);
	    
	    Sheet sh=wb.getSheet("Sheet");
	    
	    Cell cl=sh.createRow(0).createCell(0);
	    cl.setCellValue("username");
	    sh.getRow(0).createCell(1).setCellValue("password");
	    
	    sh.createRow(1).createCell(0).setCellValue("admin");
	    sh.getRow(1).createCell(1).setCellValue("manager");
	    
	    FileOutputStream fio= new FileOutputStream("‪D:\\Write.xlsx");
	    wb.write(fio);
	    System.out.println("done");
	    wb.close();
	}
}
