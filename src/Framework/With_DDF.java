package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF
{
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//fetch UN,PSW and expected UN from excel
		FileInputStream file=new FileInputStream("C:\\class\\Pallavi\\Daily Notes\\Daily Notes_Automation\\Selenium\\Parameterization\\Parameterization.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet10");
		String UN=sh.getRow(0).getCell(0).getStringCellValue();
		String PSW=sh.getRow(0).getCell(1).getStringCellValue();
		String expectedUN=sh.getRow(0).getCell(2).getStringCellValue();
		
	// enter UN
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN);
		Thread.sleep(2000);
		
	// enter PSW
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PSW);
		Thread.sleep(2000);
		
	// click on login
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(2000);
		
	// get text of actual UN
		WebElement a=driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
		String actualUN=a.getText();
		Thread.sleep(2000);
		
	//test case 1 : Verify UN
		if(expectedUN.equals(actualUN))
		{
			System.out.println("Pass");
		}
		
		else
		{
			System.out.println("Fail");
		}
		
	// close browser
		driver.close();
		
}
}
