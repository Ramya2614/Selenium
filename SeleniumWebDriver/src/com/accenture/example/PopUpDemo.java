package com.accenture.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file://10.237.3.16/training$/Selium%203.0/popup.htm");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("popup")).click();
		Alert pop=driver.switchTo().alert();
		System.out.println("The message in the popup is"+pop.getText());
		pop.accept();

	}

}
