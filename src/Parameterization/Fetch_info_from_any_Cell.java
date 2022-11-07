package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_info_from_any_Cell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		// To navigate excel sheet
			FileInputStream file=new FileInputStream("C:\\class\\Pallavi\\Daily Notes\\Daily Notes_Automation\\Selenium\\Parameterization\\Parameterization.xlsx");

		// To open excel sheet
			Sheet sh=WorkbookFactory.create(file).getSheet("Sheet8");
			
		// to get last row index
			int LastRowIndex=sh.getLastRowNum();
			
		// take for loop for Row
			for(int i=0; i<=LastRowIndex; i++)
			{
				double Value=sh.getRow(i).getCell(0).getNumericCellValue();
				System.out.println(Value);
			}
}
}