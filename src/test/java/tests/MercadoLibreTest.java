/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.DriverFactory;
import pages.HomePage;
import pages.SearchResultsPage;
import pages.FiltersPage;
import pages.ProductPage;
import utils.ScreenshotUtil;

public class MercadoLibreTest {

    private WebDriver driver;
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        // Timestamp único para el nombre del reporte
        String timestamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
        String reportPath = "reports/ReporteMercadoLibre_" + timestamp + ".html";

        // Configuración de reporte
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        extent = new ExtentReports();
        extent.attachReporter(spark);

        driver = DriverFactory.getDriver();
        driver.get("https://www.mercadolibre.com");
        driver.manage().window().maximize();

        // Crear test inicial
        test = extent.createTest("Test de búsqueda PS5");
    }

    @Test
    public void testSearchPS5() throws InterruptedException {
        // Paso 1: Selección de país
        HomePage home = new HomePage(driver);
        home.selectCountryMexico();
        test.pass("✔ País México seleccionado",
            MediaEntityBuilder.createScreenCaptureFromBase64String(
                ScreenshotUtil.takeScreenshotBase64(driver)
            ).build()
        );
        test.info("Guardado en: " + ScreenshotUtil.takeScreenshot(driver, "01.Pais_Mexico"));

        // Paso 2: Buscar PS5
        SearchResultsPage searchPage = new SearchResultsPage(driver);
        searchPage.searchProduct("playstation 5");
        test.pass("✔ Búsqueda de PlayStation 5 realizada",
            MediaEntityBuilder.createScreenCaptureFromBase64String(
                ScreenshotUtil.takeScreenshotBase64(driver)
            ).build()
        );
        test.info("Guardado en: " + ScreenshotUtil.takeScreenshot(driver, "02.Busqueda_PS5"));

        // Paso 3: Aplicar filtros
        FiltersPage filters = new FiltersPage(driver);
        filters.applyFilters();
        test.pass("✔ Filtros aplicados: Nuevo, Mayor precio primero",
            MediaEntityBuilder.createScreenCaptureFromBase64String(
                ScreenshotUtil.takeScreenshotBase64(driver)
            ).build()
        );
        test.info("Guardado en: " + ScreenshotUtil.takeScreenshot(driver, "03.Filtros"));

        // Paso 4: Imprimir productos
        ProductPage products = new ProductPage(driver);
        products.printFirstFiveProducts();
        test.pass("✔ Se imprimieron los primeros 5 productos",
            MediaEntityBuilder.createScreenCaptureFromBase64String(
                ScreenshotUtil.takeScreenshotBase64(driver)
            ).build()
        );
        test.info("Guardado en: " + ScreenshotUtil.takeScreenshot(driver, "04.Productos"));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            DriverFactory.quitDriver();
        }
        if (extent != null) {
            extent.flush();
        }
    }
}

