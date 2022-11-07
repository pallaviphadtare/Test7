package Pop_Up;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitesh Mane\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Alert Al=driver.switchTo().alert();
		
Al.accept();
Thread.sleep(2000);
Alert AL=driver.switchTo().alert();
Thread.sleep(2000);
AL.accept();
		Al.dismiss();
		String text=Al.getText();
		System.out.println(text);
		
		
		
		
}
}