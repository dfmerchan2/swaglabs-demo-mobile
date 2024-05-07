package co.com.swaglabs.userinterfaces;

import io.appium.java_client.AppiumBy;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductsPage {

    public static final Target LBL_PRODUCTS = the("Title Products")
            .locatedForAndroid(By.xpath("//android.widget.TextView[@text='PRODUCTS']"))
            .locatedForIOS(By.id(""));

    public static final Target LBL_PRODUCT = Target.the("Producto a comprar")
            .locatedBy("//android.widget.TextView[@text='{0}']");

    public static final Target BTN_ADD_TO_CART = Target.the("Boton para agregar al carrito")
            .locatedForAndroid(AppiumBy.accessibilityId("test-ADD TO CART"))
            .locatedForIOS(By.id(""));

    public static final Target BTN_BACK_PRODUCTS = Target.the("Boton para agregar al carrito")
            .locatedForAndroid(AppiumBy.accessibilityId("test-BACK TO PRODUCTS"))
            .locatedForIOS(By.id(""));

    public static final Target BTN_CART = the("Shopping cart button")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/android.widget.TextView"))
            .locatedForIOS(By.id(""));
}
