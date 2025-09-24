package pages;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author David Alejandro Rodriguez Reyes
 */

public class FiltersPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public FiltersPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Selectores
    private By conditionNew = By.xpath("//span[text()='Nuevo']");
    private By sortMenu = By.cssSelector("button[class*='andes-dropdown']");
    private By sortHighToLow = By.xpath("//span[text()='Mayor precio']");

    // Aplicar filtros
    public void applyFilters() {
        // Esperar y aplicar "Nuevo"
        wait.until(ExpectedConditions.elementToBeClickable(conditionNew)).click();
        System.out.println("✔ Filtro aplicado: condición 'Nuevo'");

        // Esperar y aplicar "Mayor precio"
        wait.until(ExpectedConditions.elementToBeClickable(sortMenu)).click();
        wait.until(ExpectedConditions.elementToBeClickable(sortHighToLow)).click();
        System.out.println("✔ Orden aplicado: 'Mayor a menor precio'");
    }
}