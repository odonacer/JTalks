package sikuli.test;
import org.sikuli.script.*;

public class Test {
	public static void main (String [] args) throws Exception
	{		
		String Logo = "/Resources/MainPageImages/Logo/logo.png";
		
		RunFirefox runFF = new RunFirefox();
		MainPageTest pageTest = new MainPageTest();
		runFF.runFirefox();
		runFF.openWebPage("http://qa.jtalks.org/jcommune");
		
		pageTest.VerifyLogo();
		
		runFF.closeFirefox();
		
		RunChrome runC = new RunChrome();
		runC.runChrome();
		runC.openWebPage("google.com");
		
		runC.closeChrome();
		
		

}

	
		
	}
