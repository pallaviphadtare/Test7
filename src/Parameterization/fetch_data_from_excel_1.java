package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_data_from_excel_1 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	// To reach out to excel sheet
	FileInputStream file=new FileInputStream("C:\\class\\Pallavi\\Daily Notes\\Daily Notes_Automation\\Selenium\\Parameterization\\Parameterization.xlsx");
	// to open an excel sheet
	Workbook excel=WorkbookFactory.create(file);
	// to open perticular sheet
	Sheet sh=excel.getSheet("sheet1");
	// to highlght perticular row
	Row S1=sh.getRow(0);
	// to highlight perticular cell/coloumn
	Cell S2=S1.getCell(0);
	// to get string value present in the excel
	String Value=S2.getStringCellValue();
	System.out.println(Value);
	// to get numeric value present in the excel
	double Value1=S2.getNumericCellValue();
	System.out.println(Value1);
	// to get boolean value present in the excel
	boolean Value2=S2.getBooleanCellValue();
	System.out.println(Value2);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
