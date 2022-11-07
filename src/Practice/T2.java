package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\class\\Pallavi\\Daily Notes\\Daily Notes_Automation\\Selenium\\Locators\\Reg.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pallavi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("gharepallavi30@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("1234567891");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='radio'][2]")).sendKeys("1234567891");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).sendKeys("1234567891");
	
	
	
}
}
