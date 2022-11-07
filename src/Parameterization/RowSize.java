package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowSize
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{

	// To navigate excel sheet
			FileInputStream file=new FileInputStream("C:\\class\\Pallavi\\Daily Notes\\Daily Notes_Automation\\Selenium\\Parameterization\\Parameterization.xlsx");
		
		// To open excel sheet
			Sheet sh=WorkbookFactory.create(file).getSheet("Sheet4");
		// To get row Size
			int RowSize=sh.getLastRowNum()+1;
			System.out.println(RowSize);
	
	
	
}
}
