package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Action
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	
	// to open an url
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
	// to identify Source path and store it into an object
		WebElement source=driver.findElement(By.xpath("//a[text()=' 5000']"));
		Thread.sleep(2000);
		
	// to identify Destination path and store it into an object
		WebElement destination=driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[2]"));
		Thread.sleep(2000);
		
	// create an object of Actions class
		Actions act=new Actions(driver);
		Thread.sleep(2000);
	
	// to perform drag and drop operation
		act.dragAndDrop(source, destination).perform();
		
		
}
}