package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	Thread.sleep(2000);
	//Switch to frame(String Framename)
	driver.switchTo().frame("iframeResult");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='button']")).click();
	
	
	
	
	
	
	
	
}
}
