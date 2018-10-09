package com.accenture.example;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindow {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://privacy.google.com/intl/en/your-data.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String parent_window=driver.getWindowHandle();
		//System.out.println("The id of parent window is "+parent_window);
		System.out.println("Parent window  title is: "+driver.getTitle());
		
		driver.findElement(By.linkText("Privacy Policy")).click();
		
		Set<String> s1=driver.getWindowHandles();
		
		Iterator<String> i1=s1.iterator();
		
		while(i1.hasNext())
		{
			String child_window=i1.next();
			//System.out.println("The id of child windows is "+child_window);
			if(!parent_window.equalsIgnoreCase(child_window))
			{
				driver.switchTo().window(child_window);
				System.out.println("Child window Title: "+driver.getTitle());
				driver.close();
						
			}
			
		}
		driver.switchTo().window(parent_window);
		System.out.println("After switching to Parent window the title is: "+driver.getTitle());

	}

}
