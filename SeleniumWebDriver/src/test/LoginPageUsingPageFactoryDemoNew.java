package test;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PageFactory.LoginPageUsingPageFactory;
import utilitypack.BrowserFactory;

public class LoginPageUsingPageFactoryDemoNew {

	public static void main(String args[])
	{
		//calling the utillitypack for initializing the browser and passing the url
		WebDriver driver=BrowserFactory.startBrowser("chrome", "http://newtours.demoaut.com/");
		
		//this will create a page object of loginpageNew class and return the object.
		LoginPageUsingPageFactory login=PageFactory.initElements(driver, LoginPageUsingPageFactory.class);
		
		login.loginUser("tutorial", "tutorial");
		login.get();
		
	}
}
