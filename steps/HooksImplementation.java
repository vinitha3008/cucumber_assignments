package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksImplementation extends LeadBaseClass{
	@Before
	public void preCondition() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leaftaps.com/opentaps/control/main");
		
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		

		
			driver.findElement(By.id("password")).sendKeys("crmsfa");
		

		
			driver.findElement(By.className("decorativeSubmit")).click();
		

		
			
			driver.findElement(By.linkText("CRM/SFA")).click();
		

		
			driver.findElement(By.linkText("Leads")).click();
		

	}}
	/*@After
	public void postCondition() {
	driver.close();
	}
}*/
