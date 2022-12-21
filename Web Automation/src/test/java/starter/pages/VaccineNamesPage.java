package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class VaccineNamesPage extends PageObject {
    private By daftarVaksinPage() {
        return By.xpath("//a[@href='/vaccine-list']");
    }
    private By vaccineNames() {
        return By.xpath("//h6");
    }
    public void goToDaftarVaksinPage() {
        $(daftarVaksinPage()).click();
    }
    public void vaccineNamesDisplayed() {
        $(vaccineNames()).isDisplayed();
    }
}
