package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class DiscoverManagement {

    public static final Target DISCOVER_COLOMBIA = Target.the("Visualiza el lugar que se va a descubrir en Colombia")
            .locatedBy("//span[contains(text(),'{0}')]");
    public static final Target RESORTS = Target.the("Se encuentra el texto Resorts")
            .locatedBy("//a[contains(text(),'Resorts')]");
    public static final Target EXPLORE_COLOMBIA = Target.the("Hacemos click en explore Colombia")
            .locatedBy("//span[contains(text(),'Explore Colombia')]");
    public static final Target START_DATE = Target.the("Fecha de inicio")
            .locatedBy("//form[@id='frm']/div[3]//div[2]//div[3]/div[1]//tr[4]/td[2]");
    public static final Target CHANGE_CURRENCY = Target.the("Fecha de inicio")
            .locatedBy(".bui-group--vertical-align-middle > div:nth-child(1) > button");
    public static final Target CHANGE_USD = Target.the("Fecha de inicio")
            .locatedBy("//div[contains(text(),'USD')]");
}