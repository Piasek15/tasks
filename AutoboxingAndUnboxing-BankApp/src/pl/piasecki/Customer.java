package pl.piasecki;

import java.util.ArrayList;

/**
 * Created by Patrick on 20 kwi 2018
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initAmount);
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
