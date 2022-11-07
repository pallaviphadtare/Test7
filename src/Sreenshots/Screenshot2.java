package Sreenshots;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2
{
	public static void main(String[] args) throws InterruptedException,Exception 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		Thread.sleep(2000);
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination=new File("C:\\class\\Screenshot\\.kite.jpeg");
		FileHandler.copy(Source, Destination);
		
		
		
		
		
}
}