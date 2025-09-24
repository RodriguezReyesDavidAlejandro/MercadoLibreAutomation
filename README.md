# MercadoLibreAutomation

Automation project with **Selenium + TestNG + ExtentReports** to test searches and filters on [MercadoLibre](https://www.mercadolibre.com).

## Notes about the Test Execution
- This project simulates an Automation Test for a Junior QA position (Testing Automation JR).
- The step Filter by location “CDMX” was omitted, since such an option does not exist in Mercado Libre.
- In the step “Print these products in the console”, the automation retrieves:
    - The original price (if available).
    - The discounted price.
    -The percentage discount of the product.
- If a product does not include a discount, only the current price is displayed.

## Technologies used
- [Java 21+](https://openjdk.org/projects/jdk/21/)
- [Maven](https://maven.apache.org/)
- [Selenium WebDriver](https://www.selenium.dev/)
- [TestNG](https://testng.org/)
- [ExtentReports](https://extentreports.com/)

## Project structure
MercadoLibreAutomation/
├── pom.xml
├── reports/ # Automatically generated HTML reports
│ ├── ReporteMercadoLibre_YYYYMMDD_HHmmss.html
│ └── screenshots/ # Screenshots used in the report
├── src/
│ ├── main/java/pages/ # Page Objects (HomePage, FiltersPage, etc.)
│ ├── main/java/utils/ # Utilities (DriverFactory, ScreenshotUtil)
│ └── test/java/tests/ # Tests (MercadoLibreTest.java)
└── testng.xml # TestNG suite

markdown

##️ Setup
1. Install **Java 21 or higher**.  
2. Verify installation:
   java -version
   mvn -version

Clone repository:
git clone https://github.com/RodriguezReyesDavidAlejandro/MercadoLibreAutomation.git
cd MercadoLibreAutomation

##️ Run tests

With Maven:
mvn clean test

With a specific testng.xml:
mvn clean test -DsuiteXmlFile=testng.xml

## Reports
After execution, the report is generated at:
reports/ReporteMercadoLibre_YYYYMMDD_HHmmss.html

## Includes:
Step-by-step evidence.
Screenshots in Base64 (embedded in the HTML).
.png screenshots stored under reports/screenshots.

##️ Included utilities
DriverFactory → Centralized WebDriver management (Chrome by default).
ScreenshotUtil → Screenshots as physical files and Base64.
Page Objects (POM) → Keeps the code clean and scalable.

Author: David Alejandro Rodriguez Reyes

------------------------------------------------------------------------------------------------------------------------------------------------------

# MercadoLibreAutomation

Proyecto de automatización con **Selenium + TestNG + ExtentReports** para probar búsquedas y filtros en [MercadoLibre](https://www.mercadolibre.com).

## Anotaciones sobre la ejecución de la prueba
- Este proyecto simula una Prueba de Automatización para un puesto JR en Testing Automation.
- El paso Filtrar por ubicación “CDMX” fue omitido, ya que dicha opción no existe en Mercado Libre.
- En el punto “Imprima estos productos en la consola”, la automatización obtiene:
    - El precio original (cuando existe).
    - El precio con descuento.
    - El porcentaje de descuento aplicado al producto.
- Si el producto no tiene descuento, únicamente se imprime el precio actual.

## Tecnologías usadas
- [Java 21+](https://openjdk.org/projects/jdk/21/)
- [Maven](https://maven.apache.org/)
- [Selenium WebDriver](https://www.selenium.dev/)
- [TestNG](https://testng.org/)
- [ExtentReports](https://extentreports.com/)

## Estructura del proyecto
MercadoLibreAutomation/
├── pom.xml
├── reports/ # Reportes HTML generados automáticamente
│ ├── ReporteMercadoLibre_YYYYMMDD_HHmmss.html
│ └── screenshots/ # Capturas de pantalla usadas en el reporte
├── src/
│ ├── main/java/pages/ # Page Objects (HomePage, FiltersPage, etc.)
│ ├── main/java/utils/ # Utilidades (DriverFactory, ScreenshotUtil)
│ └── test/java/tests/ # Tests (MercadoLibreTest.java)
└── testng.xml # Suite de TestNG

##️ Configuración
1. Instalar **Java 21 o superior**.
2. Verificar instalación:
   java -version
   mvn -version
Clonar el repositorio:

git clone https://github.com/RodriguezReyesDavidAlejandro/MercadoLibreAutomation.git
cd MercadoLibreAutomation

## Ejecutar pruebas
Con Maven:
mvn clean test

Ejecutar con un testng.xml específico:
mvn clean test -DsuiteXmlFile=testng.xml

### Reportes
Después de la ejecución, el reporte se genera en:

reports/ReporteMercadoLibre_YYYYMMDD_HHmmss.html

## Incluye:

Evidencia de cada paso
Capturas de pantalla en base64 (embebidas en el HTML) y en archivos .png dentro de reports/screenshots.

## Utilidades incluidas
DriverFactory → Manejo centralizado del WebDriver (Chrome por defecto).
ScreenshotUtil → Capturas de pantalla en archivo físico y en Base64.
Page Objects → Patrón POM implementado para mantener el código limpio.

Autor: David Alejandro Rodriguez Reyes