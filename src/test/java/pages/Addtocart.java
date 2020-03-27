package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Addtocart //adding the item in cart
{
	WebDriver driver;
	By animalid=By.xpath("/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[3]/td[5]/a[1]");
	//By click=By.linkText("EST-7");
	By addtocart=By.xpath("//a[@class='Button']");
	By updatecart=By.xpath("//input[@name='updateCartQuantities']");
	
	// to launch the browser
	
		public void url(String browser) 
		{
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja\\Desktop\\navya\\Selenium_jar_files\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\pooja\\Desktop\\navya\\Selenium_jar_files\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://petstore.octoperf.com/actions/Catalog.action?viewProduct=&productId=K9-BD-01");
		System.out.println(driver.getTitle());
	

		}
		// adding the item to the cart
		public void jpet_cart() throws InterruptedException 
		{
			driver.findElement(animalid).click();
			Thread.sleep(3000);
			//driver.findElement(click).click();	
		}
		// click on add to cart
		public void add() throws InterruptedException 
		{
			Thread.sleep(3000);
			driver.findElement(addtocart).click();		
		}
		// to update cart
		public void update() 
		{
			driver.findElement(updatecart).click();	
			driver.close();
		}
}
