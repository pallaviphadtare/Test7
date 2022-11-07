package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod_get 
{

public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe\\");
	WebDriver Driver=new ChromeDriver();
	Thread.sleep(5000);
	Driver.get("https://web.whatsapp.com");              
}
}
