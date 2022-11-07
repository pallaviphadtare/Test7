package Framework;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Without_DDF
{
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitesh Mane\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// open the webpage
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		// maximize webpage
			driver.manage().window().maximize();
			
		// wait for 10 seconds
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		// enter UN
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			
		Thread.sleep(2000);
		
		// enter password
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			
		Thread.sleep(2000);
		
		// enter login button
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

		// Test store expected UN into an object
			String ExpectedUN="Paul Collings";
			
		// get actual UN
			WebElement A=driver.findElement(By.xpath("//li[@class='oxd-userdropdown']"));
		
		// get text of actual UN
			String ActualUN=A.getText();
		
		// Test Case I : Verify UserName
			if(ExpectedUN.equals(ActualUN))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}

	
	}

}
