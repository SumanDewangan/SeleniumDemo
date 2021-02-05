package Notify;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData 
{
     public static void main(String[] args) throws Exception  
     {
		FileInputStream fis=new FileInputStream("D:\\MySE.xlsx");//path of excel file
		Workbook wb=WorkbookFactory.create(fis);//loading the excel file
		Sheet sh=wb.getSheet("Sheet1");//loaded sheet also
		int rowcount=sh.getPhysicalNumberOfRows();//how many row
		Row FirstRow=sh.getRow(0);
		for(int row=0;row<rowcount;row++)
		{
			for(int col=0;col<FirstRow.getLastCellNum();col++)
			{
				Cell cl=sh.getRow(row).getCell(col);
				System.out.print(cl+" ");
			}
			System.out.println();
		}
		
		
	 }
}
