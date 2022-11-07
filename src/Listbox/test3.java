package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test3 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	WebElement year=driver.findElement(By.xpath("//select[@title='Year']"));
	Select S1=new Select(year);
	Thread.sleep(4000);
	boolean Multi=S1.isMultiple();
	System.out.println(Multi);
//	S1.selectByVisibleText("2018");
//	S1.selectByValue("2020");
//	S1.selectByIndex(2);
	





	}
}
