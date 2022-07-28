package day4.collections.sorting.streamApi.stream.example;

import day4.collections.sorting.streamApi.stream.example.model.BankAccount;

public class BasicInnerClass {

    public static void main(String[] args) {


        BankAccount a1 = new BankAccount(1, 2000);
        BankAccount.Passbook p = a1.new Passbook();
        a1.setPassbook(p);

        a1.deposit(500);
        a1.deposit(60);
        a1.wiothdrawal(240);
        a1.printTransaction();


        BankAccount a2 = new BankAccount(2, 5000);
    }
}
