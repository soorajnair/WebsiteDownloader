package Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.*;
public class ExcessBrowser {
	String baseTab;
	String[] URL= new String[12];
	//public static String DriverPath= "C:\\Users\\sooraj\\workspace\\WebsiteDownloader\\ChromeDriver\\chromedriver.exe" ;
	public static String DriverPathIE= "\\Users\\css109558\\workspace\\WebsiteDownloader\\src\\Browser\\IE\\IEDriverServer.exe" ;
	public static WebDriver driver;
	
	public String[] GetURL() 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter URL");
				System.out.println("Enter 'q' to quit.");
				try{
					URL[0]="www.google.com";
					for(int i=0;URL[i]!=null;i++ )
					{	URL[i] = br.readLine();}
					
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
		    {
			//driver.navigate().to(MyURL[i]);
			//String baseTab = driver.getWindowHandle();
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
			driver.get(MyURL[i]); 
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}