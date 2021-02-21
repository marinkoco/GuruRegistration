package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class GuruRegister {

	public static final String REGISTRATION_URL = "http://demo.guru99.com/test/newtours/register.php";
	private static final String TXT_FNAME_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input";
	private static final String TXT_LNAME_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input";
	private static final String TXT_PHONE_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input";
	private static final String TXT_EMAIL_XPATH = "//*[@id=\"userName\"]";
	private static final String TXT_ADDRESS_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input";
	private static final String TXT_CITY_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input";
	private static final String TXT_STATE_PROVINCE_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input";
	private static final String TXT_POSTAL_CODE_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input";
	private static final String TXT_COUNTRY_DROP_DOWN_SELECT_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select";
	private static final String TXT_USER_NAME_XPATH = "//*[@id=\"email\"]";
	private static final String TXT_PASSWORD_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input";
	private static final String TXT_CONFIRM_PASSWORD_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input";
	private static final String BTTN_SUBMIT_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input";

	public static void inputFName(WebDriver driver, String FName) {
		driver.findElement(By.xpath(TXT_FNAME_XPATH)).sendKeys(FName);
	}

	public static void inputLName(WebDriver driver, String LName) {
		driver.findElement(By.xpath(TXT_LNAME_XPATH)).sendKeys(LName);
	}

	public static void inputPhone(WebDriver driver, String Phone) {
		driver.findElement(By.xpath(TXT_PHONE_XPATH)).sendKeys(Phone);
	}

	public static void inputEmail(WebDriver driver, String Email) {
		driver.findElement(By.xpath(TXT_EMAIL_XPATH)).sendKeys(Email);
	}

	public static void inputAddress(WebDriver driver, String Address) {
		driver.findElement(By.xpath(TXT_ADDRESS_XPATH)).sendKeys(Address);
	}

	public static void inputCity(WebDriver driver, String City) {
		driver.findElement(By.xpath(TXT_CITY_XPATH)).sendKeys(City);
	}

	public static void inputStateProvince(WebDriver driver, String StateProvince) {
		driver.findElement(By.xpath(TXT_STATE_PROVINCE_XPATH)).sendKeys(StateProvince);
	}

	public static void inputPostalCode(WebDriver driver, String PostalCode) {
		driver.findElement(By.xpath(TXT_POSTAL_CODE_XPATH)).sendKeys(PostalCode);
	}

	public static void selectCountry(WebDriver driver) {
		Select dropDownSort = new Select(driver.findElement(By.xpath(TXT_COUNTRY_DROP_DOWN_SELECT_XPATH)));
		dropDownSort.selectByVisibleText("SERBIA");
	}

	public static void inputUsername(WebDriver driver, String Username) {
		driver.findElement(By.xpath(TXT_USER_NAME_XPATH)).sendKeys(Username);
	}

	public static void inputPassword(WebDriver driver, String Password) {
		driver.findElement(By.xpath(TXT_PASSWORD_XPATH)).sendKeys(Password);
	}

	public static void inputConfirmPassword(WebDriver driver, String CPassword) {
		driver.findElement(By.xpath(TXT_CONFIRM_PASSWORD_XPATH)).sendKeys(CPassword);
	}

	public static void ClickSubmit(WebDriver driver) {
		driver.findElement(By.xpath(BTTN_SUBMIT_XPATH)).click();
	}

}
