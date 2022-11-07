package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");//classname.methodname(a,b); static regular method
	WebDriver Driver=new ChromeDriver();//classname objectname=new classname(); non static regular method
	Thread.sleep(2000);//time declaration to open url in seconds classname.methodname(); 
	Driver.get("https://www.facebook.com");//objectname.methodname();
}
}
