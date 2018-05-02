package pl.piasecki;

import java.util.ArrayList;

/**
 * Created by Patrick on 20 kwi 2018
 */
public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public void printBranches(boolean withTransactions){
        for (Branch branch : branches){
            branch.printCustomers(withTransactions);
        }
    }


    public boolean addTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addTransaction(customerName, amount);
        } else {
            System.out.println("Branch " + branchName + " not found in " + this.name + " bank.");
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initAmount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addCustomer(customerName, initAmount);
        } else {
            System.out.println("Branch " + branchName + " not found in " + this.name + " bank.");
            return false;
        }
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            Branch newBranch = new Branch(branchName);
            branches.add(newBranch);
            System.out.println("New branch " + branchName + " has been created.");
            return true;
        } else {
            System.out.println("Branch " + branchName + " already exists.");
            return false;
        }
    }

    private Branch findBranch(String branchName){
        for (Branch branch : branches){
            if (branch.getName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }

}
