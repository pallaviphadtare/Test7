package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LastRowIndex 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	// To navigate excel sheet
		FileInputStream file=new FileInputStream("C:\\class\\Pallavi\\Daily Notes\\Daily Notes_Automation\\Selenium\\Parameterization\\Parameterization.xlsx");
	
	// To open excel sheet
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet4");
	// To get last row index
		int LastRowIndex=sh.getLastRowNum();
		System.out.println(LastRowIndex);
	
	
	
	
}
}
