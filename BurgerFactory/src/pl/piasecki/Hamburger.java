package pl.piasecki;


/**
 * Created by Patrick on 11 kwi 2018
 */
public class Hamburger {
    private String name;
    private double price = 2.0;
    //private double basePrice = 2.0;
    private String breadRoll;
    private String meat;
    private Ingredient lettuce;
    private Tomato tomato;
    private Cucumber cucumber;
    private Cheese cheese;

    public Hamburger(String breadRoll, String meat) {
        //this.price = basePrice;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.name = "Hamburger with:\nmeat - " + meat + "(1.5$)" + "\nbread roll - " + breadRoll + "(0.5$)";
    }

    public void addLettuce(){
        if(this.lettuce == null){
            Ingredient ingredient = new Lettuce();
            this.lettuce = ingredient;
            this.price += ingredient.getPrice();
            this.name += "\n" + ingredient.getName() + "(" + ingredient.getPrice() + "$)";
        } else {
            System.out.println("You can add only one lettuce");
        }
    }

    public void addTomato(){
        if(this.tomato == null){
            Tomato tomato = new Tomato();
            this.tomato = tomato;
            this.price += tomato.getPrice();
            this.name += "\n" + tomato.getName() + "(" + tomato.getPrice() + "$)";
        } else {
            System.out.println("You can add only one tomato");
        }
    }

    public void addCucumber(){
        if(this.cucumber == null){
            Cucumber cucumber = new Cucumber();
            this.cucumber = cucumber;
            this.price += cucumber.getPrice();
            this.name += "\n" + cucumber.getName() + "(" + cucumber.getPrice() + "$)";
        } else {
            System.out.println("You can add only one cucumber");
        }
    }

    public void addCheese(){
        if (this.cheese == null){
            Cheese cheese = new Cheese();
            this.cheese = cheese;
            this.price += cheese.getPrice();
            this.name += "\n" + cheese.getName() + "(" + cheese.getPrice() + "$)";
        } else {
            System.out.println("You can add only one cheese");
        }
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    protected String getBreadRoll() {
        return breadRoll;
    }

    protected String getMeat() {
        return meat;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setPrice(double price) {
        this.price = price;
    }
}
