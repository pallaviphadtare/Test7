package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabled 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
Thread.sleep(2000);
WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
boolean S1=login.isEnabled();
System.out.println(S1);
Thread.sleep(2000);
WebElement A=driver.findElement(By.xpath("//img[@alt='Facebook']"));
boolean S=A.isEnabled();
System.out.println(S);
}
}
