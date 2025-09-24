/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author David Alejandro Rodriguez Reyes
 */
public class HomePage {
    
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Selector para el botón de México
    private By mexicoButton = By.id("MX");

    // Acción: seleccionar México
    public void selectCountryMexico() {
        driver.findElement(mexicoButton).click();
    }
}
