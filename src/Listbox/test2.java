package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test2
{
public static void main(String[] args) throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitesh Mane\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("file:///C:/class/Pallavi/Daily%20Notes/Daily%20Notes_Automation/Selenium/ListBox/MultiselectableListbox%20(1).html");
	Thread.sleep(2000);
	WebElement Listbox=driver.findElement(By.xpath("//select[@id='1234']"));
	Thread.sleep(2000);
	
	Select S=new Select(Listbox);
	boolean Multi=S.isMultiple();
	System.out.println(Multi);
	S.selectByVisibleText("Ind");
	S.selectByVisibleText("Sri");
	S.selectByVisibleText("Pak");
	S.selectByIndex(3);
//	S.deselectByIndex(3);
//	S.deselectByVisibleText("Ind");
//	S.deselectAll();
	
WebElement S1=S.getFirstSelectedOption();
//	String text=S1.getText();
	System.out.println(S1.getText());
}
}
