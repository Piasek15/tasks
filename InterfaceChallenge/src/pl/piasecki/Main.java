package pl.piasecki;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player patrick = new Player("Patrick", 100, 10);
        System.out.println(patrick.toString());
        saveObject(patrick);

        patrick.setHitPoints(55);
        System.out.println(patrick);
        patrick.setWeapon("Battle Axe");
        saveObject(patrick);
        loadObject(patrick);
        System.out.println(patrick);

        Saveable goblin = new Monster("Goblin", 10, 2);
        System.out.println(((Monster) goblin).getName());
        System.out.println(goblin);
        saveObject(goblin);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(Saveable objectToSave){
        for (int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(Saveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
