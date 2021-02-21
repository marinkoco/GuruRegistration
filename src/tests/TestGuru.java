package tests;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.GuruHome;
import objects.GuruRegister;

public class TestGuru {
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\ChromeDriver.exe");
		driver = new ChromeDriver();

	}

	@Test(priority = 1)
	public void testLinkToRegPg() {
		driver.navigate().to(GuruHome.HOME_URL);
		GuruHome.clickRegisterButton(driver);
		String actual = driver.getCurrentUrl();
		String expected = GuruRegister.REGISTRATION_URL;
		Assert.assertEquals(actual, expected);

	}

	@Test(priority = 2)
	public void testRegForm() {
		driver.navigate().to(GuruRegister.REGISTRATION_URL);

		File f = new File("data.xlsx");
		try {
			InputStream inp = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(inp);
			Sheet sheet = wb.getSheetAt(0);

			Cell c1 = sheet.getRow(0).getCell(1);
			Cell c2 = sheet.getRow(1).getCell(1);
			Cell c3 = sheet.getRow(2).getCell(1);
			Cell c4 = sheet.getRow(3).getCell(1);
			Cell c5 = sheet.getRow(4).getCell(1);
			Cell c6 = sheet.getRow(5).getCell(1);
			Cell c7 = sheet.getRow(6).getCell(1);
			Cell c8 = sheet.getRow(7).getCell(1);
			Cell c9 = sheet.getRow(8).getCell(1);
			Cell c10 = sheet.getRow(9).getCell(1);
			Cell c11 = sheet.getRow(10).getCell(1);

			String fname = c1.toString();
			String lname = c2.toString();
			String phone = c3.toString();
			String email = c4.toString();
			String address = c5.toString();
			String city = c6.toString();
			String stateprovince = c7.toString();
			String postalcode = c8.toString();
			String username = c9.toString();
			String password = c10.toString();
			String confirmpassword = c11.toString();

			GuruRegister.inputFName(driver, fname);
			GuruRegister.inputLName(driver, lname);
			GuruRegister.inputPhone(driver, phone);
			GuruRegister.inputEmail(driver, email);
			GuruRegister.inputAddress(driver, address);
			GuruRegister.inputCity(driver, city);
			GuruRegister.inputStateProvince(driver, stateprovince);
			GuruRegister.inputPostalCode(driver, postalcode);
			GuruRegister.selectCountry(driver);
			GuruRegister.inputUsername(driver, username);
			GuruRegister.inputPassword(driver, password);
			GuruRegister.inputConfirmPassword(driver, confirmpassword);
			GuruRegister.ClickSubmit(driver);

			String actual = driver.getCurrentUrl();
			String expected = "http://demo.guru99.com/test/newtours/register_sucess.php";
			Assert.assertEquals(actual, expected);

			wb.close();

		} catch (IOException e) {
			System.out.println("Nije pronadjen fajl!");
			e.printStackTrace();
		}
	}
}