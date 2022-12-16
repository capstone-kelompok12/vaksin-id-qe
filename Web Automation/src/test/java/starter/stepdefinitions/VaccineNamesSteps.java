package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.VaccineNamesPage;

public class VaccineNamesSteps {
    @Steps
    VaccineNamesPage vaccineNamesPage;

    @When("I go to Daftar Vaksin page")
    public void iGoToDaftarVaksinPage() {
        vaccineNamesPage.goToDaftarVaksinPage();
    }

    @Then("vaccine names will be displayed")
    public void vaccineNamesWillBeDisplayed() {
        vaccineNamesPage.vaccineNamesDisplayed();
    }
}
