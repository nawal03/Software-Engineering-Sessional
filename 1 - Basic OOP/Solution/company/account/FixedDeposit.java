package company.account;

public class FixedDeposit extends Account{
    private static double interestRate=0.15;
    private static double maxLoan=100000;

    public FixedDeposit(String name, double balance){
        super(name,balance);
        System.out.println("Fixed deposit account for "+name+" Created; initial balance "+balance+"$");
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        FixedDeposit.interestRate = interestRate;
    }

    @Override
    public boolean deposit(double amount){
        if(amount<50000){
            System.out.println("Minimum deposit amount is 50000$");
            return false;
        }
        this.balance+=amount;
        System.out.print(amount+" deposited; ");
        this.query();
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if(year<1 || this.balance<amount){
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
