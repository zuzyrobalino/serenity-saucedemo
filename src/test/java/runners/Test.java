package runners;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
    public static void main(String[] args) {
        // Especifica la ruta al ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");

        // Opciones de Chrome (deshabilitar sandbox)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");

        // Crear una instancia del WebDriver
        WebDriver driver = new ChromeDriver(options);

        // Tu código de prueba aquí
        driver.get("https://www.example.com");

        // Cerrar el navegador
        driver.quit();
    }
}