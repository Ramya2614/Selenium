package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndRelease {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.allstate.com");
		Actions action=new Actions(driver);
		//action.contextClick(driver.findElement(By.linkText("Contact Us")));
		//action.build().perform();
		
		//WebElement searchIcon=driver.findElement(By.linkText("Contact Us"));
		//action.clickAndHold(searchIcon).release(searchIcon);
		//action.build().perform();
		WebElement moveto=driver.findElement(By.linkText("CLAIMS"));
		action.moveToElement(moveto).click(moveto).build().perform();
		

	}

}
