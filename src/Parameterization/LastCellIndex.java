package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LastCellIndex 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// To navigate excel sheet
				FileInputStream file=new FileInputStream("C:\\class\\Pallavi\\Daily Notes\\Daily Notes_Automation\\Selenium\\Parameterization\\Parameterization.xlsx");
		
		// To open excel sheet and To get Last Cell Index 
			int LastCellIndex=WorkbookFactory.create(file).getSheet("Sheet5").getRow(0).getLastCellNum()-1;
			System.out.println(LastCellIndex);
		
		
		
		
	}
}
