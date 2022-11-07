package Practice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base_Class
{

	public WebDriver driver;
	public void openbrowser() throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitesh Mane\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


	}
	
	
	
	
	
	
	
	
	
	
	
	
}
