package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe5 
{
	
		public static void main(String[] args) throws InterruptedException 
		{

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
			Thread.sleep(2000);
			//Switch to frame(Webelement)
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframeResult']")));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='button']")).click();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='tryhome']")).click();
			
			
	
			
		}
}
