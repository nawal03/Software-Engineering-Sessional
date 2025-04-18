package company.account;

public class Student extends Account{
    private static double interestRate=0.05;
    private static double maxLoan=1000;

    public Student(String name, double balance){
        super(name,balance);
        System.out.println("Student account for "+name+" Created; initial balance "+balance+"$");
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Student.interestRate = interestRate;
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount>10000 || this.balance<amount) {
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
