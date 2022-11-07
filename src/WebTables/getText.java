package WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText
{
public static void main(String[] args) throws InterruptedException 
{

		System.setProperty("webdrievr.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		Thread.sleep(2000);
	
	// open url
		driver.get("file:///C:/Users/Hitesh%20Mane/Downloads/Table1%20(1).html");
	
		Thread.sleep(2000);
		
	// identify webtable as parent path and row as child path by relative xpath and column path by absolute xpath and store it into an object{
		WebElement value=driver.findElement(By.xpath("//table[@id='1234']//tr[3]//td[3]"));
		
	// get text for 3rd row and 3rd column
		String text=value.getText();
		System.out.println(text);
}
}