package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod_getCurrentUrl
{
public static void main(String[] args) throws InterruptedException  
{

	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	String URL=driver.getCurrentUrl();
	System.out.println(URL);
	
	
	
	
	
	
	
}
}
