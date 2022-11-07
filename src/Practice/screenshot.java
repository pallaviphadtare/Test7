package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot
{
public static void main(String[] args) throws InterruptedException, IOException 
{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	
	File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(Source);

	File Destination=new File("C:\\class\\ScreenShot\\.ScreenShot.jpeg");

	FileHandler.copy(Source,Destination);

	
	
	
}
}
