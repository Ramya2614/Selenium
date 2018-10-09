package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageDemo {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		Pages.LoginPage login=new Pages.LoginPage(driver);
		login.get();
		login.typeUsername("tutorial");
		login.typePassword("tutorial");
	 	login.clickonSubmit();
	 	
		
	}
}
