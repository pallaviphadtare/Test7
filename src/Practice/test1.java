package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com");

//		String Title=driver.getTitle();
//		System.out.println(Title);
//		String URL=driver.getCurrentUrl();
//		System.out.println(URL);
		
		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Pallavi");
//		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1345");
//		driver.findElement(By.xpath("//button[text()='Log In']")).click();

//driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
//	driver.findElement(By.xpath("//input[contains(@data-testid,'royal')]")).sendKeys("ABC");
		
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//img[@title='Printed Dress'])[1]")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@title='Printed Dress'])[2]")).click();
		
}
}