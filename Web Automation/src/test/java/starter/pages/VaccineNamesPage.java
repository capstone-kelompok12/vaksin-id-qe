package starter.pages;

import org.openqa.selenium.By;

public class VaccineNamesPage {
    private By daftarVaksinPage() {
        return By.xpath("//a[@href='/vaccine-list']");
    }
    private By vaccineNames() {
        return By.xpath("//h6");
    }
}
