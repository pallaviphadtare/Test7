package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected 
{

public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(2000);
driver.get("https://www.facebook.com");
Thread.sleep(4000);
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	WebElement select=driver.findElement(By.xpath("//input[@value='1']"));
boolean S1=select.isSelected();
	System.out.println(S1);
	

	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='Male']")).click();
	Thread.sleep(2000);
	WebElement F1=driver.findElement(By.xpath("//input[@value='2']"));
boolean S2=F1.isSelected();
	System.out.println(S2);
}
}
