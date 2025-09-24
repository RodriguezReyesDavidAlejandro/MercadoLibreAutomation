/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author David Alejandro Rodriguez Reyes
 */

/**
 * Utilidad para tomar capturas de pantalla en Selenium.
 * Se guardan en la carpeta reports/screenshots con timestamp.
 */
public class ScreenshotUtil {
      // Opción 1: Guardar en archivo físico
    public static String takeScreenshot(WebDriver driver, String stepName) {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String fileName = "reports/screenshots/" + stepName + "_" + timestamp + ".png";

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(fileName);

        try {
            Files.createDirectories(destFile.getParentFile().toPath());
            Files.copy(srcFile.toPath(), destFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileName; // ruta del archivo
    }

    // Opción 2: Devolver en Base64 (para que se vea en ExtentReport embebido)
    public static String takeScreenshotBase64(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }
}
