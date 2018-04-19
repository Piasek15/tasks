package pl.piasecki;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printListOfContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    updateContactName();
                    break;
                case 5:
                    updateContactPhoneNumber();
                    break;
                case 6:
                    removeContact();
                    break;
                case 7:
                    searchContact();
                    break;
                case 8:
                    quit = true;
                    break;
            }
        }
    }

    private static void searchContact() {
        String name = getName();

        mobilePhone.searchForContact(name);
    }

    private static void removeContact() {
        String name = getName();

        mobilePhone.removeContact(name);
    }


    private static void updateContactPhoneNumber() {
        String name = getName();
        String newNumber = getNewNumber();

        mobilePhone.modifyContactPhoneNumber(name, newNumber);
    }


    private static void updateContactName() {
        String name = getName();
        String newName = getNewName();

        mobilePhone.modifyContactName(name, newName);
    }

    private static void updateContact() {
        String name = getName();
        String newName = getNewName();
        String newNumber = getNewNumber();

        mobilePhone.modifyContact(name, newName, newNumber);
    }

    private static void addNewContact() {
        String name = getName();

        System.out.print("Please enter contact phone number: ");
        String number = scanner.nextLine();

        mobilePhone.addContact(name, number);
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add new contact to the list.");
        System.out.println("\t 3 - To modify contact in the list.");
        System.out.println("\t 4 - To modify contact name in the list.");
        System.out.println("\t 5 - To modify contact phone number in the list.");
        System.out.println("\t 6 - To remove contact form the list.");
        System.out.println("\t 7 - To search for a contact in the list.");
        System.out.println("\t 8 - To quit the application.");
    }

    private static String getNewNumber() {
        System.out.print("Please enter new contact phone number: ");
        return scanner.nextLine();
    }

    private static String getName() {
        System.out.print("Please enter contact name: ");
        return scanner.nextLine();
    }

    private static String getNewName() {
        System.out.print("Please enter new contact name: ");
        return scanner.nextLine();
    }


}
