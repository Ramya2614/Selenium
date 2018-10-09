package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

public class LoginPage extends LoadableComponent<LoginPage>{

	WebDriver driver;
	
	By username=By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input");
	By password=By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input");
	By loginbutton=By.name("login");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeUsername(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typePassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickonSubmit()
	{
		driver.findElement(loginbutton).click();
	}

	@Override
	protected void isLoaded() throws Error {
		System.out.println("in isLoaded method");
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.startsWith("http://demo"),"Not an issue entry page: "+url);
		
	}

	@Override
	protected void load() {
		System.out.println("in load method");
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}


}
