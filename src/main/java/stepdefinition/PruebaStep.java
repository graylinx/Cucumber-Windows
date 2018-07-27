package stepdefinition;

import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.nio.file.FileSystems;


public class PruebaStep implements En {
    public PruebaStep(){
        Given("^Ir a openbank$", ()->{
            System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
            System.setProperty("webdriver.gecko.driver", FileSystems.getDefault().getPath("src/main/resources/geckodriver.exe").toAbsolutePath().toString());
            System.setProperty("webdriver.firefox.bin", "C:\\\\Program Files\\\\Mozilla Firefox\\\\firefox.exe");
            WebDriver driver = new FirefoxDriver(new FirefoxOptions());
            driver.get("https://priocualb001.aws.openbank.es");
        });
    }
}
