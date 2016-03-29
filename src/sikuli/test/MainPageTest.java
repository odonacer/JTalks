package sikuli.test;
import java.util.regex.Matcher;

import org.sikuli.script.*;
import org.sikuli.script.Pattern;


public class MainPageTest {
	private String Logo = "/Resources/MainPageImages/Logo/logo.png";
			
	// English localization verifications
	private String ENSearchField = "/Resources/MainPageImages/EN/ENSearch.png";
	private String ENLoginSignUpLink = "/Resources/MainPageImages/EN/ENSignUp.png";
	private String ENLoginSignInLink = "/Resources/MainPageImages/EN/ENSignIn.png";
	private String ENLocalizationFlag = "/Resources/MainPageImages/EN/ENFlag.png";
	// Russian localization verifications
	private String RUSearchField = "/Resources/MainPageImages/RU/RUSearch.png";
	private String RULoginSignUpLink = "/Resources/MainPageImages/RU/RUSignUp.png";
	private String RULoginSignInLink = "/Resources/MainPageImages/RU/RUSignIn.png";
	private String RULocalizationFlag = "/Resources/MainPageImages/RU/RUFlag.png";
	// Ukrainian localization verifications
	private String UASearchField = "/Resources/MainPageImages/UA/UASearch.png";
	private String UALoginSignUpLink = "/Resources/MainPageImages/UA/UASignUp.png";
	private String UALoginSignInLink = "/Resources/MainPageImages/UA/UASignIn.png";
	private String UALocalizationFlag = "/Resources/MainPageImages/UA/UAFlag.png";
	Screen s = new Screen();
	
	
	
	public void VerifyLogo () throws Exception
	{
		s.wait((double)10.0);
		
		
		if (s.exists(Logo) !=null)
		{
			System.out.println("User log: Logo exists");
		}
		else
		{System.out.println("User log: Logo wasn't found!");} 
	}
	
	public void VerifyLoginSignUpLinks (String lang)
	{
		
	}
	
	public void VerifyLocalizationFlag (String lang)
	{
		
	}

}
