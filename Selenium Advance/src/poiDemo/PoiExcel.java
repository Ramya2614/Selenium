package poiDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
		String s=sheet1.getRow(i).getCell(j).getStringCellValue();
		System.out.print(s+"\t");
			}
			System.out.println("");
		}
//		sheet1.getRow(0).createCell(2).setCellValue("login");
//		FileOutputStream fo=new FileOutputStream(scr);
//		wb.write(fo);
		wb.close();
//		System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://newtours.demoaut.com/");
//		driver.findElement(By.name("userName")).sendKeys(s);
//		driver.findElement(By.name("password")).sendKeys(s1);
//		driver.findElement(By.name("login")).click();
		

	}

}
