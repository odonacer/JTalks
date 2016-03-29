// out of date class! no need to use



package sikuli.test;
import org.sikuli.script.*;
// Class for running web browser with predefined web page
public class RunTest {
	private final String MainPage = "http://qa.jtalks.org/jcommune";
	private  String webBrowser;
	Screen s = new  Screen();
	
	public void runIn (String browser)
	{
		webBrowser = browser;
		
		if (browser == "Chrome" || browser =="chrome")
		{
			 App Chrome = new App("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		Chrome.open();
		
		}
		
		
		else if (browser == "Firefox" || browser == "firefox")
		{
			App FF = new App("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			FF.open();
		}
			
	}
	
	public void openMainPage () throws Exception
	{
			
			
		s.wait((double) 5.0);
		s.type(MainPage);
		s.type(Key.ENTER);
		
		
	}
	
	
// Method for Web Browser maximize window	
	public void MaximizeWebBrowser ()
	{
		
	}
	
// Method for close Web Browser and finish test
	public void CloseWebBrowser ()
	{
		
	}
	

}
