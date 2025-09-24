# MercadoLibreAutomation

Automation project with **Selenium + TestNG + ExtentReports** to test searches and filters on [MercadoLibre](https://www.mercadolibre.com).

## Notes on the execution of the test
- This project simulates an Automation Test for a Junior Testing Automation position.  
- The step *Filter by location “CDMX”* was omitted, since such an option does not exist on Mercado Libre.  
- In the step *Print these products in the console*, the automation retrieves:
  - The original price (when available).  
  - The discounted price.  
  - The discount percentage applied to the product.  
- If the product has no discount, only the current price is printed.  

## Technologies used
- [Java 21+](https://openjdk.org/projects/jdk/21/)
- [Maven](https://maven.apache.org/)
- [Selenium WebDriver](https://www.selenium.dev/)
- [TestNG](https://testng.org/)
- [ExtentReports](https://extentreports.com/)

## Prerequisites
Before running the project, make sure you have installed:
- [Git](https://git-scm.com/) to clone the repository.  
- [Java 21 or higher](https://openjdk.org/projects/jdk/21/).  
- [Maven](https://maven.apache.org/) for project management.  
- [Google Chrome](https://www.google.com/chrome/) (latest stable version), since the project uses **ChromeDriver** by default.  

## Verify installation with:
java -version
mvn -version
git --version

##Project structure
MercadoLibreAutomation/
├── pom.xml
├── reports/ # Automatically generated HTML reports
│   ├── ReporteMercadoLibre_YYYYMMDD_HHmmss.html
│   └── screenshots/ # Screenshots used in the report
├── src/
│   ├── main/java/pages/ # Page Objects (HomePage, FiltersPage, etc.)
│   ├── main/java/utils/ # Utilities (DriverFactory, ScreenshotUtil)
│   └── test/java/tests/ # Tests (MercadoLibreTest.java)
└── testng.xml # TestNG suite

##Setup
Clone the repository:
git clone https://github.com/RodriguezReyesDavidAlejandro/MercadoLibreAutomation.git
cd MercadoLibreAutomation

## Run tests
With Maven:
mvn clean test

Run with a specific testng.xml:
mvn clean test -DsuiteXmlFile=testng.xml

## Reports
After execution, the report is generated at:
reports/ReporteMercadoLibre_YYYYMMDD_HHmmss.html

## Includes:
Evidence of each step.
Screenshots in base64 (embedded in the HTML) and as .png files inside reports/screenshots.

## Utilities included
DriverFactory → Centralized WebDriver management (Chrome by default).
ScreenshotUtil → Screenshot capture in physical file and Base64.
Page Objects → POM pattern implemented to keep the code clean.

Author: David Alejandro Rodríguez Reyes

----------------------------------------------------------------------------------------------------------------------------

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

## Requisitos previos
Antes de ejecutar el proyecto, asegúrate de tener instalado:
- [Git](https://git-scm.com/) para clonar el repositorio.
- [Java 21 o superior](https://openjdk.org/projects/jdk/21/).
- [Maven](https://maven.apache.org/) para la gestión del proyecto.
- [Google Chrome](https://www.google.com/chrome/) (última versión estable), ya que el proyecto usa **ChromeDriver** por defecto.

## Verifica instalación con:
java -version
mvn -version
git --version

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

## Configuración
Clonar el repositorio:
git clone https://github.com/RodriguezReyesDavidAlejandro/MercadoLibreAutomation.git
cd MercadoLibreAutomation

## Ejecutar pruebas
Con Maven:
mvn clean test

Ejecutar con un testng.xml específico:
mvn clean test -DsuiteXmlFile=testng.xml

## Reportes
Después de la ejecución, el reporte se genera en:
reports/ReporteMercadoLibre_YYYYMMDD_HHmmss.html

## Incluye:
Evidencia de cada paso.
Capturas de pantalla en base64 (embebidas en el HTML) y en archivos .png dentro de reports/screenshots.

## Utilidades incluidas
DriverFactory → Manejo centralizado del WebDriver (Chrome por defecto).
ScreenshotUtil → Capturas de pantalla en archivo físico y en Base64.
Page Objects → Patrón POM implementado para mantener el código limpio.

👤 Autor: David Alejandro Rodríguez Reyes
