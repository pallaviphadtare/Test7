package WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_all_data 
{
public static void main(String[] args) throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitesh Mane\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	// open the webpage
		driver.get("file:///C:/class/Pallavi/Daily%20Notes/Daily%20Notes_Automation/Selenium/WebTable/Table1.html");
		
	// fetch all data of row 3 by highlighting entire table + row3 + all data of column wrt row 3
		for(int i=1; i<=3; i++)
			{
			WebElement data=driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td["+i+"]"));
			String text=data.getText();
			System.out.print(text+" ");
			}
}
}
