package Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.*;
public class ExcessBrowser {
	
	String URL;
	//public static String DriverPath= "C:\\Users\\sooraj\\workspace\\WebsiteDownloader\\ChromeDriver\\chromedriver.exe" ;
	public static String DriverPathIE= "\\Users\\css109558\\workspace\\WebsiteDownloader\\src\\Browser\\IE\\IEDriverServer.exe" ;
	public static WebDriver driver;
	
	public String GetURL() 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter URL");
				System.out.println("Enter 'stop' to quit.");
				try{
					//do {
				URL = br.readLine();
				//} while(!URL.equals("q"));
					
				   }
				catch(Exception e)
				{
					System.out.println(e);
				}
				System.out.println(URL);
				return URL;
				
	}

	/*public void StartChrome(String MyURL)
	{
		try{System.out.println("Launching chrome Browser");
		System.setProperty("webdriver.chrome.driver",DriverPath);
		driver = new ChromeDriver();
		driver.navigate().to(MyURL);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}*/
	public void StartIE(String MyURL)
	{
		try{System.out.println("Launching InternetExplorer");
		System.setProperty("webdriver.ie.driver",DriverPathIE);
		driver = new InternetExplorerDriver();
		driver.navigate().to(MyURL);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}