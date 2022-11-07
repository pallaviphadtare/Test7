package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{

	FileInputStream file=new FileInputStream("C:\\class\\Pallavi\\Daily Notes\\Daily Notes_Automation\\Selenium\\Parameterization\\Parameterization.xlsx");
	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet9");
	int rowindex=sh.getLastRowNum();
	for(int i=0; i<=rowindex; i++)
	{
		int cellindex=sh.getRow(i).getLastCellNum()-1;
		for(int a=0; a<=cellindex; a++)
		{
			String value=sh.getRow(i).getCell(a).getStringCellValue();
			System.out.print(value+" ");
		}
	System.out.println();
	}
	
	
}

}