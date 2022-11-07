package Pop_Up;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_PopUpORChild_BrowserPopUp
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Hitesh Mane\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
		Thread.sleep(3000);
		Set<String> ID=driver.getWindowHandles();
		ArrayList<String> ar=new ArrayList<String>(ID);
		String mainpageid=ar.get(0);
		String windowpopupid=ar.get(1);
		driver.switchTo().window(windowpopupid);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Cypress'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().window(mainpageid);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(2000);
		Set<String> ID1=driver.getWindowHandles();
		ArrayList<String> ar1=new ArrayList<String>(ID1);
		String windowpopupid2=ar1.get(2);
		driver.switchTo().window(windowpopupid2);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
