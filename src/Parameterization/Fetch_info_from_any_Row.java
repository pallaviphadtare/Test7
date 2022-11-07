package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_info_from_any_Row 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{

	// To navigate excel sheet
		FileInputStream file=new FileInputStream("C:\\class\\Pallavi\\Daily Notes\\Daily Notes_Automation\\Selenium\\Parameterization\\Parameterization.xlsx");

	// To open excel sheet
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet7");
		
	// to get last cell index
		int LastCellIndex=sh.getRow(0).getLastCellNum()-1;
		
	// take for loop for cell
		for(int i=0; i<=LastCellIndex; i++)
		{
			String Value=sh.getRow(0).getCell(i).getStringCellValue();
			System.out.print(Value+" ");
		}
	
	
	
	
	
	
	
	
	
}
}
