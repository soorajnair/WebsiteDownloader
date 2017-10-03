package Background;
import java.io.*;
public class RW {
	static String file="WebsiteDownloader/src/UrlData";
	public void WriteFile() 
	{
		
	}
	public void ReadFile() 
	{
		try(BufferedReader br=new BufferedReader(new FileReader(file)))
		{
		String []Data =new String[10];
		Data[0]="fjgjhgj";
			for(int i=0;Data[i]!=null;i++)
			{
		 
			Data[i]=br.readLine();
		 
			}
			CheckFile(Data);
		}
		catch(Exception e)
		{
			
		}
		
		
	}
	public void CheckFile(String[] data) 
	{
		FileInputStream fin = null;
		// First, confirm that a filename has been specified.
		//if(args.length != 1) {
		System.out.println("Usage: ShowFile filename");
		return;
		//}
	}
	public void ClearFile() 
	{
		
	}
}
