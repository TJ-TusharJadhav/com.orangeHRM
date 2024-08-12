package Stepdefination;

import io.cucumber.java.en.*;
import testbase.Testbase;

public class login_SD extends Testbase {
	@Given("open site")
	public void open_site() throws InterruptedException {
		lunch_Chrome();
	}

	@When("Enter Email")
	public void enter_email() {
		login.enter_email("Admin");
	}

	@When("Enter password")
	public void enter_password() {
		login.enter_password("admin123");
	}

	@When("Click login button")
	public void click_login_button() throws InterruptedException   {
		login.click_on_login_btn();
		Thread.sleep(3000);
	}

	@Then("dashboard should be opened")
	public void dashboard_should_be_opened() {
		login.verify_dashboard();
		driver.quit();
	}

}
