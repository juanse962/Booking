package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SignInManagement {

    public static final Target SIGN_IN = Target.the("Ingresa a la opción renta de carros")
            .locatedBy("//div[@class='bui-group__item']//span[contains(text(),'Sign in')]");
    public static final Target INPUT_USERNAME = Target.the("Ingresa a la opción renta de carros")
            .locatedBy("//input[@id='username']");
    public static final Target INPUT_PASSWORD = Target.the("Ingresa a la opción renta de carros")
            .locatedBy("//input[@id='password']");
    public static final Target CONTINUE_BUTTON = Target.the("Ingresa a la opción renta de carros")
            .locatedBy("//span[contains(text(),'Continue with email')]");
    public static final Target SIGN_IN_BUTTON = Target.the("Ingresa a la opción renta de carros")
            .locatedBy("//span[contains(text(),'Sign in')]");
    public static final Target WELCOME = Target.the("Ingresa a la opción renta de carros")
            .locatedBy("//span[@id='profile-menu-trigger--title']");
}