package pl.piasecki;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("White", "Pork");
        hamburger.addCheese();
        hamburger.addLettuce();
        hamburger.addTomato();
        hamburger.addCucumber();
        hamburger.addCucumber();

        System.out.println("##########################");
        System.out.println(hamburger.getName());
        System.out.println("Total price: " + hamburger.getPrice());
        System.out.println("##########################");

        HealthyBurger healthyBurger = new HealthyBurger("chicken");
        healthyBurger.addRucola();
        healthyBurger.addCucumber();
        healthyBurger.addPineapple();

        System.out.println("##########################");
        System.out.println(healthyBurger.getName());
        System.out.println("Total price: " + healthyBurger.getPrice());
        System.out.println("##########################");

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("light", "beef");
        deluxeHamburger.addCheese();

        System.out.println("##########################");
        System.out.println(deluxeHamburger.getName());
        System.out.println("Total price: " + deluxeHamburger.getPrice());
        System.out.println("##########################");

    }
}
