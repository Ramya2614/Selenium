package com.acc.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooTest {
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Yahoo Tests");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("After Yahoo Tests");
	}
@BeforeClass
	public void beforeClass(){
		System.out.println("Before YahooTest Class");
	}
@AfterClass
public void afterClass(){
	System.out.println("After YahooTest Class");
}

@BeforeMethod
public void beforeMethod(){
	System.out.println("Before Each Yahoo Test");
}

@AfterMethod
public void afterMethod(){
	System.out.println("After Each Yahoo Test");
}

@Test
public void yahooMailTest(){
	System.out.println("Testing Yahoo Mail");
}

@Test
public void yahooNewsTest(){
	System.out.println("Testing Yahoo News");
}
}
