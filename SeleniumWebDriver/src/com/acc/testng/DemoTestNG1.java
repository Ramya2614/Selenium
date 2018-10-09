package com.acc.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestNG1 {
	WebDriver driver;
  @Test
  public void testMercuryToursRegistration() {
	  driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.linkText("REGISTER")).click();
	  driver.findElement(By.name("firstName")).sendKeys("Ramya");
	  driver.findElement(By.name("lastName")).sendKeys("Loganathan");
	  driver.findElement(By.name("phone")).sendKeys("9547952482");
	  driver.findElement(By.id("userName")).sendKeys("ramya@gmail.com");
	  driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Devar Street");
	  driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Ambattur");
	  driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Chennai");
	  driver.findElement(By.cssSelector("input[name='state']")).sendKeys("TamilNadu");
	  driver.findElement(By.name("postalCode")).sendKeys("600053");
	  driver.findElement(By.name("country")).sendKeys("INDIA");
	  driver.findElement(By.id("email")).sendKeys("ramya@gmail.com");
	  driver.findElement(By.cssSelector("input[name='password'][type='password']")).sendKeys("ramya");
	  driver.findElement(By.cssSelector("input[name=confirmPassword]")).sendKeys("ramya");
	  driver.findElement(By.name("register")).click();
	  Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
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
