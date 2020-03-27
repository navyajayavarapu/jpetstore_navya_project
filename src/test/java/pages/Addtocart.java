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
	
			public void browserLaunch(String browser,String url)
			{
				try {
							//To launch firefox Browser
					if (browser.equalsIgnoreCase("firefox")) {
						System.setProperty("webdriver.gecko.driver","C:\\Users\\Personal\\Desktop\\navya-testcase-master\\src\\test\\resources\\drivers\\geckodriver.exe");
						driver = new FirefoxDriver();
					}
							// To launch chrome Browser
					else if (browser.equalsIgnoreCase("chrome")) 
					{
						System.setProperty("webdriver.chrome.driver","C:\\Users\\Personal\\Desktop\\navya-testcase-master\\src\\test\\resources\\drivers\\chromedriver.exe");
						driver=new ChromeDriver();
					}
							// To launch InternetExplorer
					else if (browser.equalsIgnoreCase("Internet Explore")) {
							System.setProperty("webdriver.ie.driver","D:\\Downloads\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
						driver=new InternetExplorerDriver();  
					}
							//to maximize the window
					driver.manage().window().maximize(); 
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.get(url);
				
				} 
				
				//if browser cannot be launched
				catch (WebDriverException e) 
				{
					System.out.println("Browser could not be launched");
				}
			}
			
	public void url() {  // launching the url in chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Personal\\Desktop\\navya-testcase-master\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://petstore.octoperf.com/actions/Catalog.action?viewProduct=&productId=K9-BD-01");
		System.out.println(driver.getTitle());
	

		}
		public void jpet_cart() throws InterruptedException 
		{
			driver.findElement(animalid).click();
			Thread.sleep(3000);
			//driver.findElement(click).click();	
		}

		public void add() throws InterruptedException 
		{
			Thread.sleep(3000);
			driver.findElement(addtocart).click();		
		}

		public void update() 
		{
			driver.findElement(updatecart).click();	
			driver.close();
		}
}
