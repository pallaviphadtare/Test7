package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getNumericCellValue
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		// To navigate excel sheet
				FileInputStream file=new FileInputStream("C:\\class\\Pallavi\\Daily Notes\\Daily Notes_Automation\\Selenium\\Parameterization\\Parameterization.xlsx");
		// To open excel sheet
				double Value=WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getCell(1).getNumericCellValue();
		
				System.out.println(Value);
		
		
		
		
		
	}
}
