package pages;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import com.excelutility.ReadExcelsheet;
public class Login  //login to the application
	{	
	WebDriver driver;
	By signin=By.xpath("//*[@id=\"MenuContent\"]/a[2]");
	By username=By.name("username");
	By password=By.name("password");
	By login=By.xpath("//*[@id=\"Catalog\"]/form/input");
	
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
		// opens the signin page
		public void homepage() 
		{
			driver.findElement(signin).click();		
		}
		// to enter username
		public void Jpet_username(int i) throws IOException
		{
			//driver.findElement(username).sendKeys("navyajayavarapu");
			ReadExcelsheet read=new ReadExcelsheet();
			driver.findElement(username).sendKeys(read.Excel_Username(i));
		}
		// to enter password
		public void Jpet_password(int i) throws IOException 
		{
			//driver.findElement(password).sendKeys("navya123");
			ReadExcelsheet read=new ReadExcelsheet();
			driver.findElement(password).sendKeys(read. Excel_password(i));	
		}
		// login to the application 
		public void Login_click() throws InterruptedException //click on login button
		{
			driver.findElement(login).click();	
			Thread.sleep(4000);
			
			//To take the Screenshot
			
			Date date = new Date(0);
			String datestr = date.toString().replace(":", "-");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File screenshot = ts.getScreenshotAs(OutputType.FILE);
			screenshot.renameTo(new File("src/test/resources/Screenshots/image_login _page.png"));
	
		}
		public void close()
		{
			driver.close();
		}
}
