package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//ul[@id=\"side-menu\"]/li[3]/a")
	WebElement CUSTOMERS_BUTTON_LOCATOR;

	@FindBy(how = How.XPATH, using = "//ul[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement ADD_CUSTOMER_BUTTON_LOCATOR;

	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULLNAME_FIELD_LOCATOR;

	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_DROPDOWN_LOCATOR;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_FIELD_LOCATOR;

	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_FIELD_LOCATOR;

	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_FIELD_LOCATOR;

	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_FIELD_LOCATOR;

	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_FIELD_LOCATOR;

	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP_FIELD_LOCATOR;

	@FindBy(how = How.XPATH, using = "//select[@id='group']")
	WebElement GROUP_DROPDOWN_LOCATOR;

	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement SAVE_BUTTON_LOCATOR;

	@FindBy(how = How.XPATH, using = "//a[@id='summary']")
	WebElement SUMMARY_BUTTON_LOCATOR;

	@FindBy(how = How.XPATH, using = "//ul[@id='side-menu']/li[3]/ul/li[2]/a")
	WebElement LIST_CUSTOMERS_BUTTON_LOCATOR;

	// Methods to interact with the elements
	public void clickCustomersButton() {
		BasePage.waitForElement(driver, 2, By.xpath("//ul[@id=\"side-menu\"]/li[3]/a"));
		CUSTOMERS_BUTTON_LOCATOR.click();

	}

	public void clickAddCustomerButton() {
		BasePage.waitForElement(driver, 2, By.xpath("//ul[@id=\"side-menu\"]/li[3]/ul/li[1]/a"));
		ADD_CUSTOMER_BUTTON_LOCATOR.click();

	}

	String enteredName;

	public void insertFullName(String fullName) {
		enteredName = fullName + BasePage.randomNumGenerator();
		BasePage.waitForElement(driver, 2, By.xpath("//input[@name='account']"));
		FULLNAME_FIELD_LOCATOR.sendKeys(enteredName);

	}

	public void insertCompanyName(String company) {
		BasePage.dropDown(COMPANY_DROPDOWN_LOCATOR, company);
	}

	public void insertEmail(String email) {
		String enteredEmail = BasePage.randomNumGenerator() + email;
		BasePage.waitForElement(driver, 2, By.xpath("//input[@id='email']"));
		EMAIL_FIELD_LOCATOR.sendKeys(enteredEmail);
	}

	public void insertPhoneNumber(String phoneNum) {
		String enterphone = BasePage.randomNumGenerator() + phoneNum;
		BasePage.waitForElement(driver, 2, By.xpath("//input[@id='phone']"));
		PHONE_FIELD_LOCATOR.sendKeys(enterphone);
	}

	public void insertAddress(String address) {
		BasePage.waitForElement(driver, 2, By.xpath("//input[@id='address']"));
		ADDRESS_FIELD_LOCATOR.sendKeys(address);
	}

	public void insertCity(String city) {
		BasePage.waitForElement(driver, 2, By.xpath("//input[@id='city']"));
		CITY_FIELD_LOCATOR.sendKeys(city);
	}

	public void insertState(String state) {
		BasePage.waitForElement(driver, 2, By.xpath("//input[@id='state']"));
		STATE_FIELD_LOCATOR.sendKeys(state);
	}

	public void insertZip(String zip) {
		BasePage.waitForElement(driver, 2, By.xpath("//input[@id='zip']"));
		ZIP_FIELD_LOCATOR.sendKeys(zip);
	}

	public void insertGroup(String group) {
		BasePage.dropDown(GROUP_DROPDOWN_LOCATOR, group);
	}

	public void clickOnSaveButton() {
		SAVE_BUTTON_LOCATOR.click();
		BasePage.waitForElement(driver, 2, By.xpath("//a[@id='summary']"));

	}

	public void clickOnListCustomersButton() {
		LIST_CUSTOMERS_BUTTON_LOCATOR.click();
	}

	// tbody/tr[1]/td[3] 
	//tbody/tr[2]/td[3] 
	//tbody/tr[i]/td[3]
	
	
	// tbody/tr[1]/td[3]/following-sibling::td[4]/a[2] - Delete Button
	


	String before_xpath = "//tbody/tr[";
	String after_xpath = "]/td[3]";

	public void verifyEnteredCustomerAndDelete() {

		for (int i = 1; i <= 5; i++) {
			String name = driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText();
			 System.out.println(name);

			// Assert.assertEquals(name, enteredName, "Name does not match!!!");
			// Assert.assertEquals(actual, expected);

				/*
				 * if (name.contains(enteredName)) {
				 * //System.out.println("Entered name exists");
				 * driver.findElement(By.xpath("//tbody/tr[" + i +
				 * "]/td[3]/following-sibling::td[4]/a[2]")).click();
				 * 
				 * BasePage.waitForElement(driver, 2,
				 * By.xpath("/html/body/div[1]/div/div/div[2]/button[2]"));
				 * 
				 * driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button[2]")).
				 * click(); }
				 */

		}

	}

}
