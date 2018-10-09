package poiDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PoiExcel {

	public static void main(String[] args) throws Exception, IOException {
		File scr=new File("C:\\Selium 3.0\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(scr);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String s=sheet1.getRow(0).getCell(0).getStringCellValue();
		String s1=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(s);
		System.out.println(s1);
		wb.close();
		System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(s);
		driver.findElement(By.name("password")).sendKeys(s1);
		driver.findElement(By.name("login")).click();
		

	}

}
