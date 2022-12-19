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
        return By.xpath("//div[@class='MuiCardContent-root css-1qw96cp']");
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
        return By.xpath("//button[@fdprocessedid='my7ng']");
    }
    private By tolakSemuaButton() {
        return By.xpath("//button[@fdprocessedid='hgjdta']");
    }
    private By calendar() {
        return By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']");
    }
    private By availableDate() {
        return By.xpath("//button[@fdprocessedid='8glucq']");
    }
    private By unavailableDate() {
        return By.xpath("//button[@fdprocessedid='9smnk8']");
    }
    private By availableDateSession() {
        return By.xpath("//h6");
    }
    private By unavailableDateSession() {
        return By.xpath("//img[@src='/static/media/notfound.aa0ca37c75187772b73a.png']");
    }
    private By vaccineFilter() {
        return By.xpath("//div[@fdprocessedid='p0urda']");
    }
    private By vaccine() {
        return By.xpath("//li[@data-value='AstraZeneca']");
    }
    private By selectedVaccine() {
        return By.xpath("//h6");
    }
    private By statusFilter() {
        return By.xpath("//div[@fdprocessedid='xb3zh9']");
    }
    private By status() {
        return By.xpath("//li[@data-value='Berlangsung']");
    }
    private By selectedStatus() {
        return By.xpath("//span[@class='MuiChip-label MuiChip-labelMedium css-14vsv3w']");
    }
    private By filterButton() {
        return By.id("more-filter-button");
    }
    //private By timeFilter() {
        //return By.id("button-filter-waktu");
    //}
    //private By time() {
      //  return By.xpath("//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1ijhkwz']");
    //}
    //private By selectedTime() {
        //return
    //}
    //private By doseFilter() {
      //  return By.id("button-filter-dosis");
    //}
    //private By selectDose() {
      //  return
    //}
    //private By selectedDose() {
      //  return
    //}
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
    public void sortByDate() {
        $(calendar()).click();
    }
    public void selectAvailableDate() {
        $(availableDate()).click();
    }
    public void availableDateSessionDisplayed() {
        $(availableDateSession()).isDisplayed();
    }
    public void selectUnavailableDate() {
        $(unavailableDate()).click();
    }
    public void noBookingDisplayed() {
        $(unavailableDateSession()).isDisplayed();
    }
    public void sortByVaccine() {
        $(vaccineFilter()).click();
    }
    public void selectVaccine() {
        $(vaccine()).click();
    }
    public void sortedByVaccine() {
        $(selectedVaccine()).isDisplayed();
    }
    public void sortByStatus() {
        $(statusFilter()).click();
    }
    public void selectStatus() {
        $(status()).click();
    }
    public void sortedByStatus() {
        $(selectedStatus()).isDisplayed();
    }
}

