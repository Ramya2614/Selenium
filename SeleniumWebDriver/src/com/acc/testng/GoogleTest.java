package com.acc.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Google Tests");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("After Google Tests");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before GoogleTest Class");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("After GoogleTest Class");
	}
	 @BeforeMethod
		public void beforeMethod(){
			System.out.println("Before Each Google Test");
		}
		
		@AfterMethod
		public void afterMethod(){
			System.out.println("After Each Google Test");
		}
		@Test(enabled = false)
		
		public void GoogleMailTest(){
			System.out.println("Testing Google Mail");
		}
		
		@Test
		public void GoogleNewsTest(){
			System.out.println("Testing Google News");
		}
	}
		
