package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CarManagement {

    public static final Target CAR_RENTALS = Target.the("Ingresa a la opción renta de carros")
            .locatedBy("//span[contains(text(),'Car rentals')]");
    public static final Target INPUT_LOCATION = Target.the("Ingresa al input de la locacción")
            .locatedBy("//input[@id='ss_origin']");
    public static final Target CALENDAR = Target.the("Hace click en calendario")
            .locatedBy("//form[@id='frm']/div[2]/div[3]//div[2]/div/div/div/div[1]//button");
    public static final Target LIST_LOCATION = Target.the("Selecciona la locacion")
            .locatedBy("//form[@id='frm']/div[2]/div[1]//div[1]/ul[1]/li");
    public static final Target START_DAY = Target.the("Selecciona el dia de inicio")
            .locatedBy("//form[@id='frm']/div[2]/div[3]//div[2]/div//div/div[2]/div[2]/div[3]/div/div/div[1]//tr[4]/td[2]");
}