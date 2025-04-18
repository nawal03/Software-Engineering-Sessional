package company.account;

public abstract class Account {
    protected String name;
    protected double balance;
    protected double loan;
    protected int year;
    protected double requestedLoan;

    public Account(String name, double balance){
        this.name=name;
        this.balance=balance;
        this.loan=0;
        this.year=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
        this.balance+=loan;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRequestedLoan() {
        return requestedLoan;
    }

    public void setRequestedLoan(double requestedLoans) {
        this.requestedLoan = requestedLoans;
    }

    public boolean deposit(double amount){
        this.balance+=amount;
        System.out.print(amount+" deposited; ");
        this.query();
        return true;
    }

    public abstract boolean withdraw(double amount);

    public abstract void requestLoan(double amount);

    public abstract void increment();

    public void query(){
        if(this.loan==0) System.out.println("Current balance "+this.balance+"$");
        else System.out.println("Current balance "+this.balance+"$, loan "+this.loan+"$");
    }



}
