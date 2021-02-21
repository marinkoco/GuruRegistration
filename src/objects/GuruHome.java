package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GuruHome {
	
	public static final String HOME_URL = "http://demo.guru99.com/test/newtours/index.php";
	private static final String REGISTRATION_BTTN_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a";
	
	
	public static void clickRegisterButton(WebDriver driver) {
		driver.findElement(By.xpath(REGISTRATION_BTTN_XPATH)).click();
	}

}
