package company.bank;

import company.account.*;
import company.employee.Cashier;
import company.employee.Employee;
import company.employee.ManagingDirector;
import company.employee.Officer;

import java.util.HashMap;

public class Bank {
    private HashMap<String, Employee> employeeHashMap;
    private HashMap<String, Account> accountHashMap;
    private int year;
    private Employee curEmployee;
    private Account curAccount;
    private double fund;

    public Bank(){
        this.employeeHashMap= new HashMap<>();
        this.accountHashMap= new HashMap<>();
        this.year=0;
        this.fund=1000000;

        employeeHashMap.put("MD",new ManagingDirector("MD"));

        for(int i=1;i<=2;i++) employeeHashMap.put("S"+i, new Officer("S"+i));
        for(int i=1;i<=5;i++) employeeHashMap.put("C"+i, new Cashier("C"+i));

        System.out.println("Bank Created; M D, S1, S2, C1, C2, C3, C4, C5 created");

    }

    public void create(String name, String type, double amount){
        if(curAccount!=null || curEmployee!=null){
            System.out.println("Already logged in as another user");
            return;
        }
        if(employeeHashMap.get(name)!=null || accountHashMap.get(name)!=null){
            System.out.println("Name is already taken");
            return;
        }
        if(type.equalsIgnoreCase("Student")){
            accountHashMap.put(name, new Student(name, amount));
            curAccount=accountHashMap.get(name);
        }
        else if(type.equalsIgnoreCase("Savings")){
            accountHashMap.put(name, new Savings(name, amount));
            curAccount=accountHashMap.get(name);
        }
        else if(type.equalsIgnoreCase("Fixed")){
            if(amount<100000){
                System.out.println("Minimum initial amount should be at least 100000$");
                return;
            }
            accountHashMap.put(name, new FixedDeposit(name, amount));
            curAccount=accountHashMap.get(name);
        }
        else if(type.equalsIgnoreCase("Loan")){
            accountHashMap.put(name, new Loan(name, amount));
            curAccount=accountHashMap.get(name);
        }
        else{
            System.out.println("Type is invalid.");
        }
    }

    public void deposit(double amount){
        if(curAccount==null){
            System.out.println("You don’t have permission for this operation");
            return;
        }
        if(curAccount.deposit(amount)){
            fund+=amount;
        }
    }

    public void withdraw(double amount){
        if(curAccount==null){
            System.out.println("You don’t have permission for this operation");
            return;
        }
        if(curAccount.withdraw(amount)){
            fund-=amount;
        }

    }

    public void requestLoan(double amount){
        if(curAccount==null){
            System.out.println("You don’t have permission for this operation");
            return;
        }
        curAccount.requestLoan(amount);

    }

    public void query(){
        if(curAccount==null){
            System.out.println("You don’t have permission for this operation");
            return;
        }
        curAccount.query();
    }

    public void lookup(String name){
        if(curEmployee==null){
            System.out.println("You don’t have permission for this operation");
            return;
        }
        curEmployee.lookup(name,accountHashMap);
    }

    public void approveLoan(){
        if(curEmployee==null){
            System.out.println("You don’t have permission for this operation");
            return;
        }
        curEmployee.approveLoan(accountHashMap);
    }

    public void changeInterestRate(String type,double rate){
        if(curEmployee==null){
            System.out.println("You don’t have permission for this operation");
            return;
        }
        curEmployee.changeInterestRate(type, rate/100);
    }

    public void seeFund(){
        if(curEmployee==null){
            System.out.println("You don’t have permission for this operation");
            return;
        }
        curEmployee.seeFund(fund);
    }

    public void open(String name){
        if(curEmployee!=null || curAccount!=null){
            System.out.println("Another user already logged in");
            return;
        }

        if(employeeHashMap.get(name)!=null){
            curEmployee=employeeHashMap.get(name);
            System.out.print(name+" active; ");
            curEmployee.printPending(accountHashMap);
            System.out.println();
        }
        else if(accountHashMap.get(name)!=null){
            curAccount=accountHashMap.get(name);
            System.out.println("Welcome back, "+name);
        }
        else{
            System.out.println("No such user found");
        }
    }

    public void close(){
        if(curAccount!=null){
            System.out.println("Transaction Closed for "+ curAccount.getName());
        }
        else if(curEmployee!=null){
            System.out.println("Operation for "+ curEmployee.getName() +" closed");
        }
        else{
            System.out.println("No user logged in now");
        }
        curEmployee=null;
        curAccount=null;
    }

    public void increment(){
        this.year++;
        System.out.println(this.year+" year(s) passed");
        for(HashMap.Entry mapElement : accountHashMap.entrySet()){
            Account account = (Account) mapElement.getValue();
            account.increment();
        }
    }
}
