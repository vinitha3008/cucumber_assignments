package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadStepDefinition extends LeadBaseClass {
	@When("Click on Find Lead option")
	public void click_on_find_lead_option() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@When("Enter account name as {string} in Account name field")
	public void enter_account_name_as_in_account_name_field(String num) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(num);
	}

	@When("Click on Find account")
	public void click_on_find_account() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}

	@When("Select first account")
	public void select_first_account() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
	}

	@When("Click on Edit")
	public void click_on_edit() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@When("Edit comapny as {string}")
	public void edit_comapny_as(String company) {
		driver.findElement(By.id("updateLeadForm_companyName")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
	}

	

	@Then("Account should be edited")
	public void account_should_be_edited() {
		driver.findElement(By.name("submitButton")).click();
	}

}
