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
        manageVaccinationBookingsPage.inputEmail("admininfo@citraarafiqhospital.com");
        manageVaccinationBookingsPage.inputPassword("rscitraarafiq123");
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

    @And("I click calendar button")
    public void iClickCalendarButton() {
        manageVaccinationBookingsPage.sortByDate();
    }

    @And("I select available date")
    public void iSelectAvailableDate() {
        manageVaccinationBookingsPage.selectAvailableDate();
    }

    @Then("bookings will be sorted by selected date")
    public void bookingsWillBeSortedBySelectedDate() {
        manageVaccinationBookingsPage.availableDateSessionDisplayed();
    }

    @And("I select unavailable date")
    public void iSelectUnavailableDate() {
        manageVaccinationBookingsPage.selectUnavailableDate();
    }

    @Then("no booking will be displayed")
    public void noBookingWillBeDisplayed() {
        manageVaccinationBookingsPage.noBookingDisplayed();
    }

    @And("I click the arrow button on vaccine field")
    public void iClickTheArrowButtonOnVaccineField() {
        manageVaccinationBookingsPage.sortByVaccine();
    }

    @And("I select vaccine")
    public void iSelectVaccine() {
        manageVaccinationBookingsPage.selectVaccine();
    }

    @Then("bookings will be sorted by vaccine")
    public void bookingsWillBeSortedByVaccine() {
        manageVaccinationBookingsPage.sortedByVaccine();
    }

    @And("I click the arrow button on status field")
    public void iClickTheArrowButtonOnStatusField() {
        manageVaccinationBookingsPage.sortByStatus();
    }

    @And("I select status")
    public void iSelectStatus() {
        manageVaccinationBookingsPage.selectStatus();
    }

    @Then("bookings will be sorted by status")
    public void bookingsWillBeSortedByStatus() {
        manageVaccinationBookingsPage.sortedByStatus();
    }

    @And("I click the dots on the top right of page")
    public void iClickTheDotsOnTheTopRightOfPage() {
    }

    @And("I click Waktu button")
    public void iClickWaktuButton() {
    }

    @And("I select time")
    public void iSelectTime() {
    }

    @Then("bookings will be sorted by time")
    public void bookingsWillBeSortedByTime() {
    }

    @And("I click Dosis button")
    public void iClickDosisButton() {
    }

    @And("I select dose")
    public void iSelectDose() {
    }

    @Then("bookings will be sorted by dose")
    public void bookingsWillBeSortedByDose() {
    }
}
