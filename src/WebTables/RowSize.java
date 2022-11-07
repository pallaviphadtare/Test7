package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowSize
{
public static void main(String[] args) throws InterruptedException 
{

		System.setProperty("webdrievr.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		Thread.sleep(2000);
	
	// open url
		driver.get("file:///C:/Users/Hitesh%20Mane/Downloads/Table1%20(1).html");
	
		Thread.sleep(2000);
		
	// identify webtable as parent path and row as child path by relative xpath and store it into an object
		List<WebElement> size=driver.findElements(By.xpath("//table[@id='1234']//tr"));
	
		Thread.sleep(2000);
		
	// get Row Size
		int RowSize=size.size();
		System.out.println(RowSize);
	
	
	
	
	
	
}
}
