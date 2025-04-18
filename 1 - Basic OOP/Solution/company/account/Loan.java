package company.account;

public class Loan extends Account{

    public Loan(String name, double loan){
        super(name,loan);
        this.loan=loan;
        System.out.println("Loan account for "+name+" Created; initial balance "+balance+"$");
    }

    @Override
    public boolean deposit(double amount){
        if(this.loan<amount){
            System.out.print("You don't have this much loan to repay; ");
            this.query();
            return false;
        }
        this.loan-=amount;
        this.balance=this.loan;
        System.out.print(amount+" repaid; ");
        this.query();
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        System.out.println("Can't withdraw for loan account");
        return false;
    }

    @Override
    public void requestLoan(double amount) {
        if(requestedLoan!=0) {
            System.out.println("Invalid amount");
            return ;
        }
        if(amount!=loan*0.05){
            System.out.println("Invalid amount");
            return ;
        }
        requestedLoan=amount;
        System.out.println("Loan request successful, sent for approval");

    }

    @Override
    public void increment() {
        this.year++;
        loan=loan*(1+0.1);
        balance=loan;
    }
}
