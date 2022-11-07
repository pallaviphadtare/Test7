package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CellSize
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	
	// To navigate excel sheet
		FileInputStream file=new FileInputStream("C:\\class\\Pallavi\\Daily Notes\\Daily Notes_Automation\\Selenium\\Parameterization\\Parameterization.xlsx");
			
	// To open excel sheet
	Row sh=WorkbookFactory.create(file).getSheet("Sheet5").getRow(0);
		
	// To get Last Cell Index 
		short CellSize =sh.getLastCellNum();
		System.out.println(CellSize);
	
	
	
	
	
	
	
}
}
