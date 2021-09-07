package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class RegistryManagement {

    public static final Target REGISTER = Target.the("Hace click en el boton de registro")
            .locatedBy("//div[@class='bui-group__item']//span[contains(text(),'Register')]");
    public static final Target USERNAME_INPUT = Target.the("Ingresa el nombre del usuario")
            .locatedBy("//input[@id='username']");
    public static final Target PASSWORD_INPUT = Target.the("Ingresa la password en el input")
            .locatedBy("//input[@id='new_password']");
    public static final Target CONFIRMED_INPUT = Target.the("Ingresa el valor para confirmar")
            .locatedBy("//input[@id='confirmed_password']");
    public static final Target BUTTON_CONTINUE = Target.the("Hace click en el boton continuar")
            .locatedBy("//button/span[contains(text(),'Continue with email')]");
    public static final Target CREATE_ACCOUNT = Target.the("Crea la cuenta")
            .locatedBy("//span[contains(text(),'Create account')]");
    public static final Target ARE_YOU_A_ROBOT = Target.the("Verifica que se ingreso correctamente")
            .locatedBy("//h3");

}
