package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CarManagement {

    public static final Target CAR_RENTALS = Target.the("Ingresa a la opción renta de carros")
            .locatedBy("//span[contains(text(),'Car rentals')]");
    public static final Target INPUT_LOCATION = Target.the("Ingresa al input de la locacción")
            .locatedBy("//input[@id='ss_origin']");
    public static final Target CALENDAR = Target.the("Hace click en calendario")
            .locatedBy("//div[@data-mode='checkin']//button[@role='button']");
    public static final Target LIST_LOCATION = Target.the("Selecciona la locacion")
            .locatedBy("//form[@id='frm']/div[2]/div[1]//div[1]/ul[1]/li");
    public static final Target START_DAY = Target.the("Selecciona el dia de inicio")
            .locatedBy("//div[2][@class='xp__input-group xp__date-time']//div[2][@class='c2-month']//span[text()='20']");
    public static final Target LOCATION = Target.the("VIusaliza la localización en el mapa")
            .locatedBy("//p[@class='bui-f-font-headline_2']");
    public static final Target LOCATION_MAP = Target.the("VIusaliza la localización en el mapa")
            .locatedBy("//div[@id='map_location']");

}
