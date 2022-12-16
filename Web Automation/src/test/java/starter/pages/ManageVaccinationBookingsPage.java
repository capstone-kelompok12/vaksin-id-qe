package starter.pages;

import org.openqa.selenium.By;

public class ManageVaccinationBookingsPage {
    private By emailField() {
        return By.id(":r0:");
    }
    private By passwordField() {
        return By.id(":r1:");
    }
    private By loginButton() {
        return By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-j3w5ja']");
    }
    private By bookVaksinasiPage() {
        return By.xpath("//a[@href='/manage-booking']");
    }
    private By session() {
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
        return By.xpath("//span[@class='MuiChip-label MuiChip-labelMedium css-14vsv3w']");
    }
    private By rejected() {
        return

}
}
