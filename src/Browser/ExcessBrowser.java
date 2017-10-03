package Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.*;
public class ExcessBrowser {
	
	String URL[];
	//public static String DriverPath= "C:\\Users\\sooraj\\workspace\\WebsiteDownloader\\ChromeDriver\\chromedriver.exe" ;
	public static String DriverPathIE= "\\Users\\css109558\\workspace\\WebsiteDownloader\\src\\Browser\\IE\\IEDriverServer.exe" ;
	public static WebDriver driver;
	
	public String[] GetURL() 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter URL");
				System.out.println("Enter 'q' to quit.");
				try{
					for(int i=0;i<10 || URL[i]!="q";i++ )
				URL[i] = br.readLine();
				//} while(!URL.equals("q"));
					
				   }
				catch(Exception e)
				{
					System.out.println(e);
				}
				System.out.println(URL);
				return URL;
	}

	public void StartIE(String[] MyURL)
	{
		try{System.out.println("Launching InternetExplorer");
		System.setProperty("webdriver.ie.driver",DriverPathIE);
		driver = new InternetExplorerDriver();
		for(int i=0;i<MyURL.length;i++)
			driver.navigate().to(MyURL[i]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}