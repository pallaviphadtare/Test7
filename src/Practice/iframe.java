package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe 
{
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

		Thread.sleep(2000);

//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));		// using web element
		driver.switchTo().frame("iframeResult");		// using string frame name
//		driver.switchTo().frame("iframeResult");		// using string frame id
//		driver.switchTo().frame(0);						// using int index

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='button']")).click();

		Thread.sleep(2000);

//		driver.switchTo().parentFrame();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//a[@class='w3-button w3-bar-item topnav-icons fa fa-home']")).click();

	 driver.switchTo().defaultContent();

		 Thread.sleep(2000);

		 driver.findElement(By.xpath("//a[@class='w3-button w3-bar-item topnav-icons fa fa-home']")).click();







	}

}
