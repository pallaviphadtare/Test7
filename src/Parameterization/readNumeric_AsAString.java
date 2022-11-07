package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readNumeric_AsAString 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// To navigate excel sheet
				FileInputStream file=new FileInputStream("C:\\class\\Pallavi\\Daily Notes\\Daily Notes_Automation\\Selenium\\Parameterization\\Parameterization.xlsx");
		
		// To open excel sheet
			Sheet sh=WorkbookFactory.create(file).getSheet("Sheet6");
		
		// read numeric info as a string
			String Value=sh.getRow(0).getCell(0).getStringCellValue();
			System.out.println(Value);
		
		
	}
	
	
	
	
	
	
	
	

}
