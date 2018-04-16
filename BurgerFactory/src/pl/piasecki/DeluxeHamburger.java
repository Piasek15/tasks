package pl.piasecki;

/**
 * Created by Patrick on 16 kwi 2018
 */
public class DeluxeHamburger extends Hamburger {

    public DeluxeHamburger(String breadRoll, String meat) {
        super(breadRoll, meat);
        super.setPrice(4.0);
        super.setName("Healthy Burger with:\nmeat - " + super.getMeat()
                + "(1.5$)" + "\nbread roll - " + super.getBreadRoll() + "(0.5$)" + "\nchips (1.0$) \ndrink (1.0$)");
    }
}
