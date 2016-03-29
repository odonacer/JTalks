package sikuli.test;
import org.sikuli.script.*;

public class RunChrome {
	
	
	App chromeApp = new App("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	Screen s = new Screen();

	// Method will open Chrome web browser	
	public void runChrome () throws InterruptedException
	{
		chromeApp.open();
		s.wait((double)5.0);
	}
	
	
	// Method will open Chrome web browser and specified web page
	public void openWebPage (String webPage) 
	{
		s.type(webPage);
		s.type(Key.ENTER);
		
	}
	
	
	// Method will close Chrome web browser
	public void closeChrome()
	{
		chromeApp.close();
	}

}
