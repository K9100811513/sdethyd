package DDT.practice ;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadTheDataFromExcel {
	@Test
	public void ReadTheDataFromExcel() throws Throwable
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Kalpana\\OneDrive\\Desktop\\MAVEN 1.xlsx");	
				Workbook wb=WorkbookFactory.create(fis);
				Sheet sh=wb.getSheet("Sheet1");
				Row r=sh.getRow(3);
				Cell c=r.getCell(1);
				String val =c.getStringCellValue();
				System.out.println(val);
	}
}