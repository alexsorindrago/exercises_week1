package day4.collections.sorting.streamApi.stream.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private Passbook passbook;

    public BankAccount(int accountNumber, int balance) {
        super();
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Passbook getPassbook() {
        return passbook;
    }

    public void setPassbook(Passbook passbook) {
        this.passbook = passbook;
    }

    public void printTransaction() {
        //code to extract the passbook
        System.out.println("inside transaction");
        List<String> transactions = new Passbook().getTransactions();

        for (String t : transactions) {
            System.out.println(t);
        }
    }

    public void deposit(int amount) {
        //code to update balance
        this.balance += amount;

        //code to add transaction
        List<String> transactions = new Passbook().getTransactions();

        ////get the transaction list and add transaction
        transactions.add(amount + " - " + " deposited " + LocalDate.now());
        passbook.setTransactions(transactions);

    }

    public void wiothdrawal(int amount) {
        //code to update balance
        this.balance -= amount;

        //code to add transaction
        List<String> transactions = new Passbook().getTransactions();

        ////get the transaction list and add transaction
        transactions.add(amount + " - " + " Withdrawn " + LocalDate.now());
        passbook.setTransactions(transactions);

    }

    public class Passbook {
        List<String> transactions = new ArrayList<>();

        public List<String> getTransactions() {
            return transactions;
        }

        public void setTransactions(List<String> transactions) {
            this.transactions = transactions;
        }
    }//end of passbook

}//end of Bank Account
