package co.com.swaglabs.userinterfaces;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CartShoppingPage {

    public static final Target LBL_YOUR_CART = the("Title your car")
            .locatedForAndroid(By.xpath("//android.widget.TextView[@text='YOUR CART']"))
            .locatedForIOS(By.id(""));

    public static final Target LBL_NAME_PRODUCT = the("Label product name")
            .locatedBy("//android.widget.TextView[@text='{0}']");

    public static final Target BTN_CHECKOUT = the("Checkout button")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc='test-CHECKOUT']"))
            .locatedForIOS(By.id(""));
}
