package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_data_from_row_AND_cell 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	// To navigate excel sheet
		FileInputStream file=new FileInputStream("C:\\class\\Pallavi\\Daily Notes\\Daily Notes_Automation\\Selenium\\Parameterization\\Parameterization.xlsx");

	// To open excel sheet
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet9");
		
	// To get Last row index
		int LastRowIndex=sh.getLastRowNum();
		
	// Take outer for loop for Row and inner for loop for Cell
		for(int i=0; i<=LastRowIndex; i++)
		{
			// to get last cell index
				int LastCellIndex=sh.getRow(i).getLastCellNum()-1;
			for(int a=0; a<=LastCellIndex; a++)
			{
				String value=sh.getRow(i).getCell(a).getStringCellValue();
				System.out.print(value+" ");
			}
		System.out.println();
	
		}
	
	
	
}
}
