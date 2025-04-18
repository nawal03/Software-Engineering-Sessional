package company.account;

public class Savings extends Account{

    private static double interestRate=0.1;
    private static double maxLoan=10000;

    public Savings(String name, double balance){
        super(name,balance);
        System.out.println("Savings account for "+name+" Created; initial balance "+balance+"$");
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Savings.interestRate = interestRate;
    }

    @Override
    public boolean withdraw(double amount) {
        if(this.balance-amount<1000) {
            System.out.print("Invalid Transaction; ");
            this.query();
            return false;
        }
        this.balance-=amount;
        System.out.print(amount+" withdrawn; ");
        this.query();
        return true;
    }

    @Override
    public void requestLoan(double amount) {
        if(loan+requestedLoan+amount<=maxLoan) {
            requestedLoan+=amount;
            System.out.println("Loan request successful, sent for approval");
            return;
        }
        System.out.println("Invalid amount");

    }

    @Override
    public void increment() {
        this.year++;
        balance =  Double.max(0,(balance * (1 + interestRate) - loan * (0.1)) -500);
    }
}
