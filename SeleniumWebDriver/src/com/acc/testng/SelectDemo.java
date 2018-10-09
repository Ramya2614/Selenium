package com.acc.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SelectDemo {
	WebDriver driver;
	
  @Test
  public void Login() {
	  driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.name("userName")).sendKeys("tutorial");
	  driver.findElement(By.name("password")).sendKeys("tutorial");
	  driver.findElement(By.name("login")).click();
	  driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
	  driver.findElement(By.name("passCount")).sendKeys("4");
	  WebElement from=driver.findElement(By.name("fromPort"));
	  Select sel=new Select(from);
	  List<WebElement> list= sel.getOptions();
	  for(WebElement e:list){
		  String city=e.getText();
		  if(city.equals("Paris")){
			  sel.selectByValue(city);
			  break;
		  }
	  }
	  
	  driver.findElement(By.name("fromMonth")).sendKeys("November");
	  WebElement date=driver.findElement(By.name("fromDay"));
	  Select sele=new Select(date);
	  sele.selectByVisibleText("15");
//	  List<WebElement> lis=sele.getOptions();
//	  for(WebElement d:lis){
//		  String dat=d.getText();
//		  if(dat.equals("15")){
//			  sele.selectByVisibleText(dat);
//			  break;
//		  }
//		  
//	  }
	  
	  driver.findElement(By.name("toPort")).sendKeys("Seattle");
	  driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
	  driver.findElement(By.name("airline")).sendKeys("pangea airline");
	  driver.findElement(By.name("findFlights")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.close();
  }

}
