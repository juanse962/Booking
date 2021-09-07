package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SignInManagement {

    public static final Target SIGN_IN = Target.the("Ingresa a la opción renta de carros")
            .locatedBy("//div[@class='bui-group__item']//span[contains(text(),'Sign in')]");

    public static final Target USERNAME_INPUT = Target.the("Ingresa a la opción renta de carros")
            .locatedBy("//input[@id='username']");
    public static final Target PASSWORD_INPUT = Target.the("Ingresa a la opción renta de carros")
            .locatedBy("//input[@id='new_password']");
    public static final Target CONFIRMED_INPUT = Target.the("Ingresa a la opción renta de carros")
            .locatedBy("//input[@id='confirmed_password']");
    public static final Target BUTTON_CONTINUE = Target.the("Ingresa a la opción renta de carros")
            .locatedBy("//button/span[contains(text(),'Continue with email')]");
    public static final Target CREATE_ACCOUNT = Target.the("Ingresa a la opción renta de carros")
            .locatedBy("//span[contains(text(),'Create account')]");
    public static final Target ARE_YOU_A_ROBOT = Target.the("Ingresa a la opción renta de carros")
            .locatedBy("//h3");

}
