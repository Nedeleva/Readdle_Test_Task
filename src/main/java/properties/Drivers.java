package properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static constants.Constants.IMPLICITLY_WAIT;

public class Drivers {

    public enum Driver {
        CHROMEDRIVER("src/main/resources/driver/chromedriver", "webdriver.chrome.driver");
        private final String pathToDriver;
        private final String nameOfDriver;

        Driver(String path, String name) {
            this.pathToDriver = path;
            this.nameOfDriver = name;
        }

        public String getPathToDriver() {
            return pathToDriver;
        }

        public String getNameOfDriver() {
            return nameOfDriver;
        }
    }

    public static WebDriver getDriver(Driver driverKey) {
        String driverName = driverKey.getNameOfDriver();
        String driverPath = driverKey.getPathToDriver();
        WebDriver driver;
        System.setProperty(driverName, driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITLY_WAIT));
        return driver;
    }
}
