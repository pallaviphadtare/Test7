package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod_getSize
{
public static void main(String[] args) throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	Dimension D=driver.manage().window().getSize();
	
	System.out.println(D);
	
	
	
	
	
	
	
}
}
