package android;

import androidx.annotation.NonNull;
import androidx.car.app.CarContext;
import androidx.car.app.Screen;
import androidx.car.app.model.Action;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.Template;

/**
 * A screen that shows a simple "Hello World!" message.
 *
 * <p>See {@link HelloWorldService} for the app's entry point to Android Auto.
 */
public class HelloWorldScreen extends Screen {
    public HelloWorldScreen(@NonNull CarContext carContext) {
        super(carContext);
    }

    @NonNull
    @Override
    public Template onGetTemplate() {
        return new PaneTemplate.Builder(new Pane.Builder().build())
                .setHeaderAction(Action.APP_ICON)
                .build();
    }
}