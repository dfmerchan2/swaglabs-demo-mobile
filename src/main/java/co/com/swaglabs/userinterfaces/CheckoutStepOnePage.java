package co.com.swaglabs.userinterfaces;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CheckoutStepOnePage {

    public static final Target TXT_FIRST_NAME = the("Input first Name")
            .locatedForAndroid(By.xpath("//android.widget.EditText[@content-desc='test-First Name']"))
            .locatedForIOS(By.id(""));

    public static final Target TXT_LAST_NAME = the("Input last Name")
            .locatedForAndroid(By.xpath("//android.widget.EditText[@content-desc='test-Last Name']"))
            .locatedForIOS(By.id(""));

    public static final Target TXT_POSTAL_CODE = the("Input postal Code")
            .locatedForAndroid(By.xpath("//android.widget.EditText[@content-desc='test-Zip/Postal Code']"))
            .locatedForIOS(By.id(""));

    public static final Target BTN_CONTINUE = the("Continue button")
            .locatedForAndroid(By.xpath("//android.widget.TextView[@text='CONTINUE']"))
            .locatedForIOS(By.id(""));
}
