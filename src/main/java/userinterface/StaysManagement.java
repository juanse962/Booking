package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class StaysManagement {
    public static final Target TRAVEL_INPUT = Target.the("Ingresa la locacion para viajar")
            .locatedBy("//input[@id='ss']");
    public static final Target CALENDAR = Target.the("Hace click en el calendario")
            .locatedBy("//form[@id='frm']//div[2]//div[2]/div/div/div/div/span");
    public static final Target START_CALENDAR = Target.the("Fecha de inicio del viaje")
            .locatedBy("//form[@id='frm']//div[2]//div[3]/div[1]//tr[3]/td[1]");
    public static final Target FINISH_CALENDAR = Target.the("Fecha fin del viaje")
            .locatedBy("//form[@id='frm']//div[2]//div[3]/div[1]//tr[3]/td[5]");
    public static final Target BUTTON_SEARCH = Target.the("Hace click en el boton search")
            .locatedBy("//button/span[contains(text(),'Search')]");
    public static final Target TEXT_SEARCH = Target.the("Visualiza el lugar a buscar")
            .locatedBy("//h1[contains(text(),'{0}')]");
}