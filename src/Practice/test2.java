package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
WebDriver D=new ChromeDriver();
D.get("https://www.facebook.com/");
Thread.sleep(2000);
WebElement PW=D.findElement(By.xpath("//input[@id='pass']"));
boolean A=PW.isEnabled();
System.out.println(A);






}
}
