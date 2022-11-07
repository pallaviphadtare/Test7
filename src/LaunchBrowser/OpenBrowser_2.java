package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser_2
{
public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://web.whatsapp.com");
	
	
	
	
	
	
}
}
