package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ManageVaccinationBookingsPage;

public class ManageVaccinationBookingsSteps {
    @Steps
    ManageVaccinationBookingsPage manageVaccinationBookingsPage;

    @Given("I am on landing page")
    public void iAmOnLandingPage() {
        manageVaccinationBookingsPage.openUrl();
    }

    @And("I have logged in")
    public void iHaveLoggedIn() {
        manageVaccinationBookingsPage.goToLoginPage();
        manageVaccinationBookingsPage.inputEmail("adminpkumuhdelanggu@gmail.com");
        manageVaccinationBookingsPage.inputPassword("pkumuhdelanggu123");
        manageVaccinationBookingsPage.login();
    }

    @When("I go to Book Vaksinasi page")
    public void iGoToBookVaksinasiPage() {
        manageVaccinationBookingsPage.goToBookVaksinasiPage();
    }

    @And("I select a session")
    public void iSelectASession() {
        manageVaccinationBookingsPage.selectUnconfirmedSession();
    }

    @And("I click check button")
    public void iClickCheckButton() {
        manageVaccinationBookingsPage.approveBookingRequest();
    }

    @Then("the booking will be approved")
    public void theBookingWillBeApproved() {
        manageVaccinationBookingsPage.bookingApproved();
    }

    @And("I select all bookings")
    public void iSelectAllBookings() {
        manageVaccinationBookingsPage.selectAllBookings();
    }

    @And("I click Terima Semua button")
    public void iClickTerimaSemuaButton() {
        manageVaccinationBookingsPage.approveAllBookingRequests();
    }

    @And("I click X button")
    public void iClickXButton() {
        manageVaccinationBookingsPage.rejectBookingRequest();
    }

    @Then("the booking will be rejected")
    public void theBookingWillBeRejected() {
        manageVaccinationBookingsPage.bookingRejected();
    }

    @And("I click Tolak Semua button")
    public void iClickTolakSemuaButton() {
        manageVaccinationBookingsPage.rejectAllBookingRequests();
    }
}
