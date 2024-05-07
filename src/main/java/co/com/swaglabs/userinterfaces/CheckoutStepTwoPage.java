package co.com.swaglabs.userinterfaces;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CheckoutStepTwoPage {

    public static final Target LBL_CHECKOUT_OVERVIEW = the("Title checkout overview")
            .locatedForAndroid(By.xpath("//android.widget.TextView[@text='CHECKOUT: OVERVIEW']"))
            .locatedForIOS(By.id(""));

    public static final Target LBL_NAME_PRODUCT = the("Label product name")
            .locatedBy("//android.widget.TextView[@text='{0}']");

    public static final Target BTN_FINISH = the("Finish button")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc='test-FINISH']"))
            .locatedForIOS(By.id(""));
}
