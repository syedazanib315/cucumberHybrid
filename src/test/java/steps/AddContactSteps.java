package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.AddCustomerPage;
import page.BasePage;
import page.ContactPage;
import page.DashBoardPage;
import page.LoginPage;
import util.Assertion;
import util.BrowserFactory;

public class AddContactSteps extends BasePage {
	WebDriver driver;
	LoginPage login;
	DashBoardPage dashboardPage;
	AddCustomerPage addcustomerPage;
	ContactPage contactPage;
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.init();
		login = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashBoardPage.class);
		addcustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		contactPage = PageFactory.initElements(driver, ContactPage.class);
		
		
	}

	@Given("^A user logged in$")
	public void a_user_logged_in() throws Throwable {
		
		login.enterUserName("demo@techfios.com");
		login.enterPassword("abc123");	
		login.clickSignInButton();
		
	}
	

	@When("^User goes to CRM Add Contact Page$")
	public void user_goes_to_CRM_Add_Contact_Page() throws Throwable {
		addcustomerPage.clickCustomersButton();
		addcustomerPage.clickAddCustomerButton();
	
	}

	@Then("^Contact Page should display$")
	public void contact_Page_should_display() throws Throwable {
		String expected = "Contacts - iBilling";
		Assertion.equals("Contact Page is not Displayed", contactPage.getPageTitle() , expected);
	}

	@When("^User fill in the Add Contact \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"$")
	public void user_fill_in_the_Add_Contact(String fullName, String company, String email, String phoneNum, String address, String city, String state, String zip) throws Throwable {
		addcustomerPage.insertFullName(fullName);
		addcustomerPage.insertCompanyName(company);
		addcustomerPage.insertEmail(email);
		addcustomerPage.insertPhoneNumber(phoneNum);
		addcustomerPage.insertAddress(address);
		addcustomerPage.insertCity(city);
		addcustomerPage.insertState(state);
		addcustomerPage.insertZip(zip);
	}
	

	@Then("^Created contact will be dispalyed$")
	public void created_contact_will_be_dispalyed() throws Throwable {
		addcustomerPage.clickOnSaveButton();
	}


}
