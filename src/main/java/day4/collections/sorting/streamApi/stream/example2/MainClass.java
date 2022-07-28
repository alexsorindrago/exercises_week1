package day4.collections.sorting.streamApi.stream.example2;

import day4.collections.sorting.streamApi.stream.example2.model.CurrentAccount;
import day4.collections.sorting.streamApi.stream.example2.model.SavingsAccount;

public class MainClass {
    public static void main(String[] args) {
        BankingService bankingService = new BankingServiceImplementation();

        SavingsAccount sa = new SavingsAccount();

        CurrentAccount ca = new CurrentAccount();
        bankingService.doWithdrawal(ca, 2000);
    }
}
