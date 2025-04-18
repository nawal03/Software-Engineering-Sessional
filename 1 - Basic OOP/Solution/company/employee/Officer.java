package company.employee;

import company.account.Account;

import java.util.HashMap;

public class Officer extends Cashier{
    public Officer(String name){
        super(name);
    }
    @Override
    public void approveLoan(HashMap<String, Account> accountHashMap) {

        for(HashMap.Entry mapElement : accountHashMap.entrySet()){
            String name = (String) mapElement.getKey();
            Account account = (Account) mapElement.getValue();
            if(account.getRequestedLoan()!=0){
                account.setLoan(account.getLoan()+account.getRequestedLoan());
                account.setRequestedLoan(0);
                System.out.println("Loan for "+name+" approved");
            }
        }
    }

    @Override
    public void printPending(HashMap<String, Account> accountHashMap) {
        boolean isPending=false;
        for(HashMap.Entry mapElement : accountHashMap.entrySet()){
            String name = (String) mapElement.getKey();
            Account account = (Account) mapElement.getValue();
            if(account.getRequestedLoan()!=0){
                isPending=true;
            }
        }
        if(isPending) System.out.print("There are loan approvals pending");
    }

}
