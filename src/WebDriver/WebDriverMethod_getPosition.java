package WebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverMethod_getPosition 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		Point P=driver.manage().window().getPosition();
		System.out.println(P);
		
}
}