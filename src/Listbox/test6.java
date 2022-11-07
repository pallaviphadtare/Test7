package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test6
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	WebElement multiListBox=driver.findElement(By.xpath("//select[@id='day']"));
	Select S=new Select(multiListBox);
	Thread.sleep(2000);
	List<WebElement> S1=S.getOptions();
	for(WebElement S3:S1)
	{
		System.out.println(S3.getText());
	}
	
	
	
	
	
	
	
	
}
}
