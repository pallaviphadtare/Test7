package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod_setSize 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://web.whatsapp.com");
	Thread.sleep(2000);
	Dimension Size=new Dimension(700,500);
	driver.manage().window().setSize(Size);
	
	
	
	
	
	
	
	
	
}
}
