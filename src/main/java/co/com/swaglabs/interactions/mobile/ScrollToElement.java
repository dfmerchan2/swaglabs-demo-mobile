package co.com.swaglabs.interactions.mobile;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static co.com.swaglabs.utilities.ScreenSpecifications.getWidthSizeScreen;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollToElement implements Task {

    private final Target element;
    private final int scrollSize;

    public ScrollToElement(Target element, int scrollSize) {
        this.element = element;
        this.scrollSize = scrollSize;
    }

    @Step("{0} performs a horizontal scroll from the element #element")
    @Override
    public <T extends Actor> void performAs(T actor) {
        while (!element.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    Scroll.verticalFromCenter(getWidthSizeScreen(scrollSize))
            );
        }
    }

    public static Performable with(Target element, int scrollSize) {
        return instrumented(ScrollToElement.class, element, scrollSize);
    }
}
