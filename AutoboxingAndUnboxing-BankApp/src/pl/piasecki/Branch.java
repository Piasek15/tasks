package pl.piasecki;

import java.util.ArrayList;

/**
 * Created by Patrick on 20 kwi 2018
 */
public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public void printCustomers(boolean withTransactions){
        System.out.println("Customers in " + this.name + " branch:");
        for (int i=0; i<customers.size(); i++){
            System.out.println(i+1 + ". " + customers.get(i).getName());
            if (withTransactions){
                for (int j=0; j<customers.get(i).getTransactions().size(); j++){
                    double transaction = customers.get(i).getTransactions().get(j).doubleValue();
                    System.out.println("\t" + (j+1) + ". " + transaction);
                }
            }
        }
    }


    public boolean addTransaction(String customerName, double amount){
        Customer customer = findCustomer(customerName);
        if (customer != null){
            customer.addTransaction(amount);
            System.out.println(amount + "added to the customer " + customerName + " transactions.");
            return true;
        } else {
            System.out.println("Customer " + customerName + " not found in " + this.name + "branch.");
            return false;
        }
    }

    public boolean addCustomer(String customerName, double initAmount){
        if (findCustomer(customerName) == null){
            Customer newCustomer = new Customer(customerName, initAmount);
            customers.add(newCustomer);
            System.out.println("Customer " + customerName + " has been added to the "
                    + this.name + " branch.");
            return true;
        } else {
            System.out.println("Customer " + customerName + " already exists in the "
                    + this.name + " branch.");
            return false;
        }
    }

    private Customer findCustomer(String customerName){
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
