package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_class
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("http://automationpractice.com//index.php");
	Thread.sleep(2000);
	WebElement women=driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	act.moveToElement(women).perform();
	Thread.sleep(2000);
	act.click(women).perform();

		

	}

}
