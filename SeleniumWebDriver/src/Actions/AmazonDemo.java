package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions action=new Actions(driver);
		WebElement menu=driver.findElement(By.xpath("//*[@id='nav-link-shopall']/span[2]"));
		action.moveToElement(menu).build().perform();
		WebElement subMenu=driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[6]/span"));
		action.moveToElement(subMenu).build().perform();
		WebElement item=driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[3]/div[6]/div[1]/div/a[5]/span"));
		action.moveToElement(item).click(item).build().perform();

	}

}
