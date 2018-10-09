package com.accenture.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo123 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selium 3.0\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div/div/div/div/h3/a")).click();
		driver.close();

	}

}
