package selneiumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		//i want to test a web app
		System.setProperty("webdriver.chrome.driver", "E:\\chrome version\\89\\chromedriver.exe");
		//this will opent he browser
		WebDriver driver = new ChromeDriver();
		//i have to open the URL
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//i have to enter username and password//i am stroing username elemen in a varibale 
		WebElement username = driver.findElement(By.id("txtUsername"));
		//if that element is enabled then i will enter the name
		if(username.isEnabled())
		{
			//this is basically to clear the value of an element 
			username.clear();
			username.sendKeys("Admin");
		}
			if(username.isDisplayed())
			{
				//then i want to enter password and click on login button
				WebElement pwd = driver.findElement(By.id("txtPassword"));
				//i am clearning the pwd
				pwd.clear();
				//i am sending some value to my pwd element
				pwd.sendKeys("admin123");
				driver.findElement(By.id("btnLogin")).click();
				Thread.sleep(3000);
				//i want to find out how many links are there
			List<WebElement> link = driver.findElements(By.tagName("a"));
			//if i want to know how many links are ther//
			System.out.println(link.size());
			//i want to print the names of the link present in the web page 
			//when ever i want to iterate again and again i use for loop
			for(int i=0;i<link.size();i++)
			{
				System.out.println(link.get(i).getText());
			}
			}
			else
			{
				System.out.println("Not displayed");
			}
			}
	}


