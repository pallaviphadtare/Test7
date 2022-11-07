package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	Thread.sleep(2000);
	
	driver.navigate().to("https://web.whatsapp.com");
	driver.navigate().to("https://www.facebook.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();

	Thread.sleep(2000);
	
	String title=driver.getTitle();
	System.out.println(title);

	Thread.sleep(2000);
	
	String URL=driver.getCurrentUrl();
	System.out.println(URL);

	Thread.sleep(2000);

	driver.manage().window().maximize();

	Thread.sleep(2000);

	driver.manage().window().minimize();

	Thread.sleep(2000);

	Dimension Size=new Dimension(400,200);
	driver.manage().window().setSize(Size);
	
	Thread.sleep(2000);

	Dimension size=driver.manage().window().getSize();
	System.out.println(size);
	
	Thread.sleep(2000);

	Point P1=new Point(600,600);
	driver.manage().window().setPosition(P1);

}
}
