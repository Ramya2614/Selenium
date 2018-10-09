package com.accenture.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByIndex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file://10.237.3.16/training$/Selium%203.0/iframe.htm");
		driver.manage().window().maximize();
		int size=driver.findElements(By.tagName("iframe")).size();
		System.out.println("The number of frames in the page: "+size);
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.id("subframe")).getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iframe3");
		driver.findElement(By.linkText("Google")).click();
	}

}
