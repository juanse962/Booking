package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SignInManagement {

    public static final Target SIGN_IN = Target.the("Hace click en el botón Sign in")
            .locatedBy("//div[@class='bui-group__item']//span[contains(text(),'Sign in')]");
    public static final Target INPUT_USERNAME = Target.the("Ingresa el vlaor en el input username")
            .locatedBy("//input[@id='username']");
    public static final Target INPUT_PASSWORD = Target.the("Ingresa el vlaor en el input password")
            .locatedBy("//input[@id='password']");
    public static final Target CONTINUE_BUTTON = Target.the("Hace click en el boton continuar")
            .locatedBy("//span[contains(text(),'Continue with email')]");
    public static final Target SIGN_IN_BUTTON = Target.the("Hace click en el boton sign in")
            .locatedBy("//span[contains(text(),'Sign in')]");
    public static final Target WELCOME = Target.the("Verifica el mesnaje de bienvenida")
            .locatedBy("//body[@id='b2indexPage']//nav[1]/div[2]/div[6]/div/a");
}