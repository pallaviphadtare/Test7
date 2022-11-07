package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class MultiBrowser_OR_CT 
{
	@Parameters("browsername")
	@Test
	public void TC1(String browsername) throws InterruptedException
	{
		WebDriver driver=null;
		if(browsername.equals("Chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver.exe");
			driver=new ChromeDriver();	
			
		}
		
		else if(browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hitesh Mane\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
		
		}
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		    
         driver.manage().window().maximize();
         
		  //wait
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  //Enter UN
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");	
		  
		//wait
		 Thread.sleep(2000);	
		 
		 //Enter Password
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");	
		 
			//wait
		 Thread.sleep(2000);
		 
		 //click login Button
		 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		 
		 //Test Case-I:Verify UserName	
		 	String ExpectedUN="Paul Collings";
		 	WebElement value=driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
		 	String ActualUN=value.getText();
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
