package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test1
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(2000);
driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
WebElement Date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select S=new Select(Date);
	Thread.sleep(5000);
	S.selectByVisibleText("1");
//	S.selectByValue("5");
//	S.selectByIndex(30);
//	boolean S1=S.isMultiple();
//	System.out.println(S.isMultiple());
//	WebElement text=S.getFirstSelectedOption();
//	String T=text.getText();
//	System.out.println(T);
	
	

	
}
	
}

