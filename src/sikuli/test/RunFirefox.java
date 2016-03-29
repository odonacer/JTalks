package sikuli.test;
import org.sikuli.script.*;

public class RunFirefox {
	
		
		App firefoxApp = new App("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		Screen s = new Screen();

		// Method will open FF web browser	
		public void runFirefox () throws Exception
		{
			firefoxApp.open();
			s.wait((double)8.0);
		}
		
		
		// Method will open FF web browser and specified web page
		public void openWebPage (String webPage) 
		{
			
			s.type(webPage);
			s.type(Key.ENTER);
			
		}
		
		
		// Method will close FF web browser
		public void closeFirefox()
		{
			firefoxApp.close();
		}

	}



