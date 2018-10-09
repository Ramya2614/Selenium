package com.acc.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Popup {
	WebDriver driver;
	
  @Test
  public void popup() {
	  driver.navigate().refresh();
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("popup")).click();
		Alert pop=driver.switchTo().alert();
		System.out.println("The message in the popup is "+pop.getText());
		pop.accept();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("file://10.237.3.16/training$/Selium%203.0/popup.htm");
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

}
