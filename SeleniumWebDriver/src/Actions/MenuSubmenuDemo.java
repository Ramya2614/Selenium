package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuSubmenuDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.allstate.com");
		Actions action=new Actions(driver);
//		WebElement menu=driver.findElement(By.xpath("//*[@id='1512537295608']/div/div/div[3]/div[3]/ul/li[2]/button"));
//		action.moveToElement(menu).click(menu).build().perform();
//		WebElement subMenu=driver.findElement(By.xpath("//*[@id='1512537295608']/div/div/div[3]/div[3]/ul/li[2]/div/div[2]/ul/li[1]/a"));
//		action.moveToElement(subMenu).click(subMenu).build().perform();
		WebElement menu=driver.findElement(By.linkText("INSURANCE & MORE"));
		action.moveToElement(menu).click(menu).build().perform();
		WebElement submenu=driver.findElement(By.name("&lpos=MainNav"));
		action.moveToElement(submenu).click(submenu).build().perform();
		

	}

}
