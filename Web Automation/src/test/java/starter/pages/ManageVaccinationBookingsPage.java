package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ManageVaccinationBookingsPage extends PageObject {
    private By loginPage() {
        return By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium css-51t0sx']");
    }
    private By emailField() {
        return By.xpath("//input[@name='email']");
    }
    private By passwordField() {
        return By.xpath("//input[@name='password']");
    }
    private By loginButton() {
        return By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-j3w5ja']");
    }
    private By bookVaksinasiPage() {
        return By.xpath("//a[@href='/manage-booking']");
    }
    private By unconfirmedSession() {
        return By.xpath("//div[@class='MuiCardActions-root MuiCardActions-spacing css-1k3fh4f']");
    }
    private By checkButton() {
        return By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-sizeMedium css-11nfi0']");
        //button[@fdprocessedid='ckv46m']
    }
    private By xButton() {
        return By.xpath("//button[@fdprocessedid='xn9icp']");
    }
    private By approved() {
        return By.xpath("//div[@class='MuiChip-root MuiChip-filled MuiChip-sizeMedium MuiChip-colorSoftSuccess MuiChip-filledSoftSuccess css-15bit62']");
        //span[@class='MuiChip-label MuiChip-labelMedium css-14vsv3w']
    }
    private By rejected() {
        return By.xpath("//div[@class='MuiChip-root MuiChip-filled MuiChip-sizeMedium MuiChip-colorSoftDanger MuiChip-filledSoftDanger css-t15oan']");
    }
    private By checkboxAllBookings() {
        return By.xpath("//input[@aria-label='Select all rows']");
    }
    private By terimaSemuaButton() {
        return By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium css-51t0sx']");
    }
    private By tolakSemuaButton() {
        return By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedDanger MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-root MuiButton-outlined MuiButton-outlinedDanger MuiButton-sizeMedium MuiButton-outlinedSizeMedium css-emnt2y']");
    }

    public void openUrl() {
        openAt("/");
    }
    public void goToLoginPage() {
        $(loginPage()).click();
    }
    public void inputEmail(String email) {
        $(emailField()).type(email);
    }
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }
    public void login() {
        $(loginButton()).click();
    }
    public void goToBookVaksinasiPage() {
        $(bookVaksinasiPage()).click();
    }
    public void selectUnconfirmedSession() {
        $(unconfirmedSession()).click();
    }
    public void approveBookingRequest() {
        $(checkButton()).click();
    }
    public void rejectBookingRequest() {
        $(xButton()).click();
    }
    public void bookingApproved() {
        $(approved()).isDisplayed();
    }
    public void bookingRejected() {
        $(rejected()).isDisplayed();
    }
    public void selectAllBookings() {
        $(checkboxAllBookings()).click();
    }
    public void approveAllBookingRequests() {
        $(terimaSemuaButton()).click();
    }
    public void rejectAllBookingRequests() {
        $(tolakSemuaButton()).click();
    }
}

