package com.acc.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FrameByName {
	WebDriver driver;
	
  @Test
  public void Frame() {
	  driver.get("file://10.237.3.16/training$/Selium%203.0/iframe.htm");
	  driver.manage().window().maximize();
		driver.switchTo().frame("iframe3");
		driver.findElement(By.linkText("Google")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  
  }

}
