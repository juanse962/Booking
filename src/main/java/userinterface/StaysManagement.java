package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class StaysManagement {
    public static final Target SIGN_UP= Target.the("Seleccioanr el login")
            .locatedBy("//a[contains(text(),'Sign up')]");
    public static final Target TRAVEL_INPUT = Target.the("Seleccionar input del email sign in")
            .locatedBy("//input[@id='ss']");
    public static final Target CALENDAR = Target.the("Seleccionar input del password")
            .locatedBy("//form[@id='frm']//div[2]//div[2]/div/div/div/div/span");
    public static final Target START_CALENDAR = Target.the("Seleccionar input del password")
            .locatedBy("//form[@id='frm']//div[2]//div[3]/div[1]//tr[3]/td[1]");
    public static final Target FINISH_CALENDAR = Target.the("Hace click en el boton para iniciar sesion")
            .locatedBy("//form[@id='frm']//div[2]//div[3]/div[1]//tr[3]/td[5]");
    public static final Target BUTTON_SEARCH = Target.the("Visualiza el texto Home Page de bienvenida")
            .locatedBy("//button/span[contains(text(),'Search')]");
    public static final Target TEXT_SEARCH = Target.the("Visualiza el texto Home Page de bienvenida")
            .locatedBy("//h1[contains(text(),'{0}')]");
}