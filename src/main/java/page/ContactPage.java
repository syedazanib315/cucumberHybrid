package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactPage {
	
	WebDriver driver;

	public ContactPage(WebDriver driver) {

		this.driver = driver;

	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//ul[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement ADD_CUSTOMER_BUTTON_LOCATOR;

	// Methods to interact with the elements

	// public void verifyDashBoardElement()
	// {
	// Asserts.assertEquals(DASHBOARD_ELEMENT_FIELD.getText(), "Dashboard", "Wrong
	// page!!!");
	// }
	public String getPageTitle() {
		return driver.getTitle();
	}
}



