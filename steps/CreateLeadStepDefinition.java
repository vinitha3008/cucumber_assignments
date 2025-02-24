package steps;

import org.openqa.selenium.By;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDefinition extends LeadBaseClass {

	
	@When("click on createlead link")
	public void click_on_createlead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@When("enter the company name as {string}")
	public void enter_the_company_name_as_c_name(String company) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
	}

	@When("enter the firstname as {string}")
	public void enter_the_firstname_as_f_name(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}

	@When("enter the lastname as {string}")
	public void enter_the_lastname_as_l_name(String lastName) {
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}

	@When("click on create lead button")
	public void click_on_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("lead should be created")
	public void lead_should_be_created() {
		 System.out.println("Lead is created");
	}

}


