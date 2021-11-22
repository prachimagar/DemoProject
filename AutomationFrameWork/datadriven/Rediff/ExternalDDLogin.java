package Rediff;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExternalDDLogin {
	WebDriver driver;

	@Test(dataProvider = "dp")
	public void chrome(String user, String pass) {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.id("login1")).sendKeys(user);

		driver.findElement(By.name("passwd")).sendKeys(pass);

		driver.findElement(By.className("signinbtn")).click();

		
		System.out.println(user+"||"+pass);
	}

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	@DataProvider
	public Object[][] dp() throws IOException {

	XSSFWorkbook wb=new XSSFWorkbook(".//src//test//resources//Files//RediffLoginData.xlsx");
		XSSFSheet sheet=wb.getSheetAt(0);
		int allRows=sheet.getLastRowNum()+1;
		int allCells=sheet.getRow(0).getLastCellNum();
		Object[][] obj = new Object[allRows][allCells];
		
		for(int i=0;i<allRows;i++) {
			for(int j=0;j<allCells;j++) {
				if(sheet.getRow(i).getCell(j).getCellType().equals(CellType.BLANK)){
					obj[i][j]="";
				}
				else if(sheet.getRow(i).getCell(j).getCellType().equals(CellType.NUMERIC)) {
					obj[i][j]=String.valueOf(sheet.getRow(i).getCell(j).getNumericCellValue());
				}
				else if(sheet.getRow(i).getCell(j).getCellType().equals(CellType.FORMULA)) {
					obj[i][j]=String.valueOf(sheet.getRow(i).getCell(j).getCellFormula());
				}
				else if(sheet.getRow(i).getCell(j).getCellType().equals(CellType.STRING)) {
					obj[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				}
			}
		}
		wb.close();
		
		
		return obj;
	}
}