package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

/**
 *
 * @author David Alejandro Rodriguez Reyes
 */
public class ProductPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // espera explícita
    }

    // Selectores principales
    private By productCards = By.cssSelector("li.ui-search-layout__item");
    private By productTitle = By.cssSelector("a.poly-component__title");

    // Precio vigente (actual)
    private By currentPrice = By.cssSelector("span.andes-money-amount:not(.andes-money-amount--previous) .andes-money-amount__fraction");

    // Precio anterior (tachado)
    private By oldPrice = By.cssSelector("s.andes-money-amount--previous .andes-money-amount__fraction");

    // Descuento
    private By discountPercent = By.cssSelector("span.andes-money-amount__discount");

    public void printFirstFiveProducts() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(productCards));

        List<WebElement> cards = driver.findElements(productCards);

        int total = Math.min(5, cards.size());
        System.out.println("===== Primeros " + total + " productos =====");

        for (int i = 0; i < total; i++) {
            WebElement card = cards.get(i);
            String title = card.findElement(productTitle).getText();

            // Precio actual
            String price = "";
            List<WebElement> priceElement = card.findElements(currentPrice);
            if (!priceElement.isEmpty()) {
                price = priceElement.get(0).getText();
            }

            // Precio anterior
            String old = "";
            List<WebElement> oldPriceElement = card.findElements(oldPrice);
            if (!oldPriceElement.isEmpty()) {
                old = " | Antes: $" + oldPriceElement.get(0).getText();
            }

            // Descuento
            String discount = "";
            List<WebElement> discountElement = card.findElements(discountPercent);
            if (!discountElement.isEmpty()) {
                discount = " | Descuento: " + discountElement.get(0).getText();
            }

            // Imprimir todo
            System.out.println((i + 1) + ". " + title + " - $" + price + old + discount);
        }
    }
}
