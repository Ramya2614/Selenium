package com.acc.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTestNG {
	WebDriver driver;
  @Test
  public void openSelenium() throws InterruptedException {
	  driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	  driver.findElement(By.name("btnK")).click();
	  driver.findElement(By.className("LC20lb")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}