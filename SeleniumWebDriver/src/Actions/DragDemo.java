package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		WebElement resize=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(resize, 400, 400).build().perform();
		

	}

}
