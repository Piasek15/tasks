package pl.piasecki;

/**
 * Created by Patrick on 16 kwi 2018
 */
public class HealthyBurger extends Hamburger{

    private Rucola rucola;
    private Pineapple pineapple;

    public HealthyBurger(String meat) {
        super("brown rey bread roll" ,meat);
        super.setPrice(2.5);
        super.setName("Healthy Burger with:\nmeat - " + super.getMeat()
                + "(1.5$)" + "\nbread roll - " + super.getBreadRoll() + "(1.0$)");
    }

    public void addRucola(){
        if(this.rucola == null){
            Rucola rucola = new Rucola();
            this.rucola = rucola;
            double newPrice = super.getPrice();
            newPrice += rucola.getPrice();
            super.setPrice(newPrice);
            String newName = super.getName();
            newName += "\n" + rucola.getName() + "(" + rucola.getPrice() + "$)";
            super.setName(newName);
        } else {
            System.out.println("You can add only one rucola");
        }
    }

    public void addPineapple(){
        if(this.pineapple == null){
            Pineapple pineapple = new Pineapple();
            this.pineapple = pineapple;
            double newPrice = super.getPrice();
            newPrice += pineapple.getPrice();
            super.setPrice(newPrice);
            String newName = super.getName();
            newName += "\n" + pineapple.getName() + "(" + pineapple.getPrice() + "$)";
            super.setName(newName);
        } else {
            System.out.println("You can add only one pineapple");
        }
    }

}
