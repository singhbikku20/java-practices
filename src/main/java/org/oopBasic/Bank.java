package org.oopBasic;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account){
        accounts.add(account);
    }
    public double getTotalBalance(){

        double totalBalance = 0.00;
        for(BankAccount account:accounts){
            totalBalance+=account.getAccountBalance();
        }
        return totalBalance;
    }


    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.name = "ICICI Bank";
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        BankAccount bankAccount3 = new BankAccount();

        bankAccount1.setAccountHoldersName("Arun Singh");
        bankAccount1.setAccountNumber("123");
        bankAccount1.setAccountBalance(100000.00);
        bankAccount2.setAccountHoldersName("Diya Singh");
        bankAccount2.setAccountNumber("124");
        bankAccount2.setAccountBalance(200000.00);
        bankAccount3.setAccountHoldersName("Divya Singh");
        bankAccount3.setAccountNumber("125");
        bankAccount3.setAccountBalance(300000.00);

        bank.addAccount(bankAccount1);
        bank.addAccount(bankAccount2);
        bank.addAccount(bankAccount3);

        System.out.println("Total Balance: "+bank.getTotalBalance()+" in bank named "+bank.name);

    }

}
