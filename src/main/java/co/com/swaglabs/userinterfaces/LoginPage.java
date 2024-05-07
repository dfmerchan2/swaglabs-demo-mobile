package co.com.swaglabs.userinterfaces;

import io.appium.java_client.AppiumBy;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class LoginPage {

    public static final Target TXT_USER = the("Input Username")
            .locatedForAndroid(AppiumBy.accessibilityId("test-Username"))
            .locatedForIOS(By.id(""));

    public static final Target TXT_PASSWORD = the("Input Password")
            .locatedForAndroid(AppiumBy.accessibilityId("test-Password"))
            .locatedForIOS(By.id(""));

    public static final Target BTN_LOGIN = the("Button Login")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']"))
            .locatedForIOS(By.id(""));

    public static final Target MESSAGE_ERROR = the("Message error")
            .locatedForAndroid(By.xpath("//android.widget.TextView[@text='Username and password do not match any user in this service.']"))
            .locatedForIOS(By.id(""));
}