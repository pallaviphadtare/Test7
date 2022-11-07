package Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_or_child_browser_popup
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitesh Mane\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	
	// open url
		driver.get("https://nxtgenaiacademy.com/multiplewindows");
		Thread.sleep(2000);
		
	// click on 1st window popup
		driver.findElement(By.xpath("//button[@name='newbrowserwindow123']")).click();
		Thread.sleep(2000);
		
	// to get ids of main page n window pop up1
		Set<String> IDs=driver.getWindowHandles();
		ArrayList<String> ar=new ArrayList<String>(IDs);
		String mainpageid=ar.get(0);
		String window1id=ar.get(1);		
		Thread.sleep(2000);
		
	// shift selenium focus from main page to 1st window popup
		driver.switchTo().window(window1id);
		Thread.sleep(2000);
		
	// maximize and close the window popup1
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		
	// switch to main page and open window popup2
		driver.switchTo().window(mainpageid);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='newmessagewindow321']")).click();
		Thread.sleep(4000);
		
	// to get id of window pop up2
		Set<String> ids=driver.getWindowHandles();
		ArrayList<String> ar1=new ArrayList<String>(ids);
		String window2id=ar1.get(2);
	
		
	// shift selenium focus from main page to 2nd window popup
		driver.switchTo().window(window2id);
		Thread.sleep(4000);
		
	// maximize and close the window popup2
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		
	// switch to main page and open window popup3
		driver.switchTo().window(mainpageid);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='newbrowsertab453']")).click();
		Thread.sleep(3000);
		
	// to get id of window pop up3
		Set<String> Ids=driver.getWindowHandles();
		ArrayList<String> ar2=new ArrayList<String>(Ids);
		String window3id=ar2.get(3);
		Thread.sleep(3000);
		
	// shift selenium focus from main page to 3rd window popup
		driver.switchTo().window(window3id);
		Thread.sleep(3000);
		
	// click on course features tab present on window popup3
		driver.findElement(By.xpath("//span[text()='Course Features']")).click();
		Thread.sleep(3000);
		
	// switch to main page
		driver.switchTo().window(mainpageid);



	}

}
