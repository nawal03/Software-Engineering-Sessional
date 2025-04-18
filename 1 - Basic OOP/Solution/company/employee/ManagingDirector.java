package company.employee;

import company.account.Account;
import company.account.FixedDeposit;
import company.account.Savings;
import company.account.Student;

import java.util.HashMap;

public class ManagingDirector extends Officer{
    public ManagingDirector(String name) {
        super(name);
    }

    @Override
    public void changeInterestRate(String type, double rate) {
        if(type.equalsIgnoreCase("Student")){
            Student.setInterestRate(rate);
            System.out.println("Operation successful");
        }
        else if(type.equalsIgnoreCase("Savings")){
            Savings.setInterestRate(rate);
            System.out.println("Operation successful");
        }
        else if(type.equalsIgnoreCase("Fixed")){
            FixedDeposit.setInterestRate(rate);
            System.out.println("Operation successful");
        }
        else{
            System.out.println("No such type found");
        }
    }

    @Override
    public void seeFund(double fund) {
        System.out.println("Total internal fund of the bank is " +fund);
    }

}
