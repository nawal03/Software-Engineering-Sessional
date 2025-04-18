package company.employee;

import company.account.Account;

import java.util.HashMap;


public abstract class Employee {
    protected String name;

    public Employee(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public  void lookup(String name, HashMap<String, Account> accountHashMap){
        System.out.println("You don’t have permission for this operation");
    }
    public  void approveLoan(HashMap<String, Account> accountHashMap){
        System.out.println("You don’t have permission for this operation");
    }
    public  void changeInterestRate(String type,double rate){
        System.out.println("You don’t have permission for this operation");
    }
    public  void seeFund(double fund){
        System.out.println("You don’t have permission for this operation");
    }

    public abstract void printPending(HashMap<String, Account> accountHashMap);

}
