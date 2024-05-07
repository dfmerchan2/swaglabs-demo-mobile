package co.com.swaglabs.userinterfaces;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CheckoutCompletePage {

    public static final Target LBL_CHECKOUT_COMPLETE = the("Title checkout complete")
            .locatedForAndroid(By.xpath("//android.widget.TextView[@text='THANK YOU FOR YOU ORDER']"))
            .locatedForIOS(By.id(""));
}
