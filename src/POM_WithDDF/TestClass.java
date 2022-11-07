package POM_WithDDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	// fetch UN,PSW and expected UN from excel sheet
		FileInputStream file=new FileInputStream("C:\\class\\Pallavi\\Daily Notes\\Daily Notes_Automation\\Selenium\\Parameterization\\Parameterization.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet10");
		String UserN=sh.getRow(0).getCell(0).getStringCellValue();
		String PaaSW=sh.getRow(0).getCell(1).getStringCellValue();
		String ExpectedUN=sh.getRow(0).getCell(2).getStringCellValue();
		
	// create an object of LoginPage POM class
		LoginPage LP=new LoginPage(driver);
		LP.EnterUN(UserN);
		Thread.sleep(2000);
		
		LP.EnterPSW(PaaSW);
		Thread.sleep(2000);
		
		LP.ClickBtn();
		Thread.sleep(2000);
		
	// create an object of PIMPage POM class
		PIMPage PP=new PIMPage(driver);
		PP.VerifyUN(ExpectedUN);
		Thread.sleep(2000);
		
	// close browser
		driver.close();
		
		
		
	
	}

	
	}
	
		
	

