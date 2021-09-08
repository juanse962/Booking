package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MailManagement {

    public static final Target INPUT_MAIL = Target.the("Ingresa email en el input")
            .locatedBy("//div[@id='emk_banner_index']//div/input");
    public static final Target BUTTON_MAIL = Target.the("Envia el correo electronico")
            .locatedBy("//span[text()='Sign me up!']");
    public static final Target VERIFICATION_TEXT = Target.the("Mensjae de suscripción no existe")
            .locatedBy("//div[@id='emk_banner_index__title']");
}
