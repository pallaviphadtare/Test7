package POM_PageObjectModel;

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
		
	// create an object of LoginPage POM class
		LoginPage LP=new LoginPage(driver);
		LP.EnterUN();
		Thread.sleep(2000);
		
		LP.EnterPSW();
		Thread.sleep(2000);
		
		LP.ClickBtn();
		Thread.sleep(2000);
		
	// create an object of PIMPage POM class
		PIMPage PP=new PIMPage(driver);
		PP.VerifyUN();
		Thread.sleep(2000);
		
	// close browser
		driver.close();
		
		
		
	
	}

	
	}
	
		
	

