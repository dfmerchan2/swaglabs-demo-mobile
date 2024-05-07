package co.com.swaglabs.utilities;

import io.appium.java_client.AppiumDriver;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MyDriver {

    private static AppiumDriver driver;

    public static AppiumDriver getDriverAppium() {
        return driver;
    }

    @SneakyThrows
    public static AppiumDriver mobile() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel 3 API 30");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");
        capabilities.setCapability("appPackage", "com.swaglabsmobileapp");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("autoGrantPermissions", "true");
        capabilities.setCapability("noReset", "false");
        capabilities.setCapability("autoDismissAlerts", "true");
        capabilities.setCapability("unicodeKeyboard", "true");
        capabilities.setCapability("appWaitDuration", "80000");
        capabilities.setCapability("app", "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        return driver;
    }

}