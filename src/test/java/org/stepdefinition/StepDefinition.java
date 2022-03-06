package org.stepdefinition;

import org.commonmethods.CommonMethods;
import org.repository.RepositoryPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinition extends RepositoryPage {

	@Given("^open book my trip$")
	public void bTrip() {
		CommonMethods.url("https://www.booking.com/");
	}

	@When("^Book the flight from chennai to mumbai$")
	public void passingElement() throws InterruptedException {
		CommonMethods.pause();
		getFlight().click();
		getOneway().click();
		CommonMethods.select_gender(getSelect(), 0);
		getAdult().click();
		getAdd().click();
		getDone().click();
		getAirport().click();
		getTick().click();
		getFrom().sendKeys("chennai");
		getFrom1().click();
		Thread.sleep(1000);
		getTo().sendKeys("mumbai");
		getTo1().click();
		// Thread.sleep(1000);
		getDateoption().click();
		getDate().click();
		getDirect_flight().click();
		getSearch().click();
		Thread.sleep(5000);
		getSee_flight().click();
		Thread.sleep(2000);
		getSelect1().click();
		getSelect2().click();
		getContact_email().sendKeys("mukeshsac10@gmail.com");
		getPhone().sendKeys("9176306306");
		getFirst_name().sendKeys("mukesh");
		getLast_name().sendKeys("T");
		CommonMethods.select_gender(getGender(), 1);
		getFirst_name1().sendKeys("nandhini");
		getLast_name2().sendKeys("M");
		CommonMethods.select_gender(getGender1(), 2);
		getNext().click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		getNext().click();
		Thread.sleep(3000);
		CommonMethods.scrollUp_Down();
		CommonMethods.pause();
		getCardholder_name().sendKeys("T Mukesh");
		getCardholder_number().sendKeys("4356-8765-9876");

	}

}
