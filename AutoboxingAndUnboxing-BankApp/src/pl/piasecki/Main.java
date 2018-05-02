package pl.piasecki;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("ZZZ");

        bank.addBranch("First");

        bank.addCustomer("First", "Patrick", 1000.59);
        bank.addCustomer("First", "Sarah", 160.23);
        bank.addCustomer("First", "Sam", 0.69);

        bank.addBranch("Second");

        bank.addCustomer("Second", "Merry", 11.11);

        bank.addTransaction("First", "Patrick", 1);
        bank.addTransaction("First", "Patrick", 100000.03);
        bank.addTransaction("First", "Sam", 8.88);
        bank.addTransaction("First", "Patrick", -300);

        bank.printBranches(true);


    }
}
