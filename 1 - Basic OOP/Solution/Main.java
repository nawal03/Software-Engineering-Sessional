import company.bank.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        while(true){
            String command = sc.next();

            if(command.equals("Create")){
                String name = sc.next();
                String type = sc.next();
                double amount = sc.nextDouble();
                bank.create(name,type,amount);
            }
            else if(command.equals("Deposit")){
                double amount = sc.nextDouble();
                bank.deposit(amount);
            }
            else if(command.equals("Withdraw")){
                double amount = sc.nextDouble();
                bank.withdraw(amount);
            }
            else if(command.equals("Request")){
                double amount = sc.nextDouble();
                bank.requestLoan(amount);
            }
            else if(command.equals("Query")){
                bank.query();
            }
            else if(command.equals("Lookup")){
                String name = sc.next();
                bank.lookup(name);
            }
            else if(command.equals("Approve")){
                bank.approveLoan();
            }
            else if(command.equals("Change")){
                String type=sc.next();
                Double rate=sc.nextDouble();
                bank.changeInterestRate(type,rate);
            }
            else if(command.equals("See")){
                bank.seeFund();
            }
            else if(command.equals("INC")){
                bank.increment();
            }
            else if(command.equals("Open")){
                String name = sc.next();
                bank.open(name);
            }
            else if(command.equals("Close")){
                bank.close();
            }
            else{
                System.out.println("Invalid Command");
            }
        }
    }
}
/*
Create Alice Student 1000
Deposit 20000
Withdraw 12,000
Query
Request 500
Close
Open S1
Approve
Change Student 7.50
Lookup Alice
See
Close
Open Alice
Query
Close
INC
Open Alice
Query
Close

Student account for Alice Created; initial balance 1,000$
20,000$ deposited; current balance 21,000$
Invalid transaction; current balance 21,000$
Current balance 21,000
Loan request successful, sent for approval
Transaction Closed for Alice
S1 active, there are loan approvals pending
Loan for Alice approved
You don’t have permission for this operation
Alice’s current balance 21,500$
You don’t have permission for this operation
Operations for S1 closed
Welcome back, Alice
Current Balance 21,500$, loan 500$
Transaction Closed for Alice
1 year passed
Welcome back, Alice
Current balance, 22,525$, loan 500$
Transaction Closed for Alice
 */