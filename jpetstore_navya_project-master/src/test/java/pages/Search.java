package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Search 
{
	WebDriver driver;
	By searchbar=By.xpath("//*[@id=\"SearchContent\"]/form/input[1]");
	By senddata=By.xpath("//*[@id=\"SearchContent\"]/form/input[1]");
	By sclick=By.xpath("//*[@id=\"SearchContent\"]/form/input[2]");
	By animalid=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[2]/b/a/font");
	
	// to launch the browser
	
		public void url(String browser) 
		{
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
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
		// searching for required product
		public void jpet_search()
		{
			driver.findElement(searchbar).click();
			driver.findElement(senddata).sendKeys("bulldog");
			//driver.findElement(sclick).click();			
		}
		// selecting the product through product id
		public void senddata() throws InterruptedException 
		{
			Thread.sleep(3000);
			driver.findElement(sclick).click();		
			driver.findElement(animalid).click();
		}

		public void sbutton() 
		{
		
		driver.close();
		}

}
