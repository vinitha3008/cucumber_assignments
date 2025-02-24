package steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLeadStepDefinition extends LeadBaseClass {
	@When("Click Find accounts")
	public void click_find_accounts() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@When("Enter Account name as {string}")
	public void enter_account_name_as(String name) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(name);
	}

	@When("Click on Find Account button")
	public void click_on_find_account_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}

	@When("Select first acc")
	public void select_first_acc() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@When("Click on Deactivate the account")
	public void click_on_deactivate_the_account() {
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
	}

	

}
