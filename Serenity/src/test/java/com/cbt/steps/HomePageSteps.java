package com.cbt.steps;

import org.openqa.selenium.Keys;

import com.cbt.page_objects.HomePage;

import net.thucydides.core.annotations.Step;

public class HomePageSteps {
	HomePage homePage;

	@Step
	public void openGoogle() {
		homePage.open();
	}

	@Step
	public void iEnterSearchTerm(String searchTerm) {
		homePage.searchField.sendKeys(searchTerm);
	}

	@Step
	public void iClickOnSearch() {
		homePage.submitButton().sendKeys("" +Keys.ENTER);
		
	}

	public void iClickLink(String string) {
		homePage.link(string).click();
	}
}
