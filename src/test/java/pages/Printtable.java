package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Printtable
{	
	WebDriver driver=new ChromeDriver();
	By animal=By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img");
	
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
					else if (browser.equalsIgnoreCase("Internet Explorer")) {
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
	
	public void url() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Personal\\Desktop\\navya-testcase-master\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		System.out.println(driver.getTitle());
	

		}
		// prints the selected product related matches as a table
		public void jpet_print()
		{
			driver.findElement(animal).click();
			String x;
			for(int r=2;r<=5;r++)
			{
				for(int c=1;c<=2;c++)
				{
					x="//*[@id=\"Catalog\"]/table/tbody/tr["+r+"]/td["+c+"]"; //*[@id="Catalog"]/table/tbody/tr[2]/td[1]/a
					String s=driver.findElement(By.xpath(x)).getText();
					System.out.print(s+"  ");
				}
			System.out.println(" ");	
			}
			
		}

		public void verify() 
		{
			System.out.println(" details of the selected animal");
		}

		public void submit() 
		{
		
		driver.close();
		}

}
