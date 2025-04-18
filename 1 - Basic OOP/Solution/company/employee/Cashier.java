package company.employee;

import company.account.Account;

import java.util.HashMap;

public class Cashier extends Employee{
    public Cashier(String name) {
        super(name);
    }

    @Override
    public void lookup(String name, HashMap<String, Account> accountHashMap) {
        Account account=accountHashMap.get(name);
        if(account==null){
            System.out.println("No such account exists");
        }
        else{
            System.out.println(name+"’s current balance "+account.getBalance()+"$");
        }
    }

    @Override
    public void printPending(HashMap<String, Account> accountHashMap) {
        return;
    }

}
