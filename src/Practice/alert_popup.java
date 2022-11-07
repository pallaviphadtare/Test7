package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_popup 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://nxtgenaiacademy.com/alertandpopup");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@name='alertbox']")).click();
	Thread.sleep(2000);
	Alert A=driver.switchTo().alert();
	A.accept();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
	Thread.sleep(3000);
	Alert A1=driver.switchTo().alert();
	A1.dismiss();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
	Thread.sleep(3000);
	Alert A2=driver.switchTo().alert();
//	A2.sendKeys("no");
//	Thread.sleep(3000);
	System.out.println(A2.getText());
	Thread.sleep(3000);
	A2.accept();


}
}
