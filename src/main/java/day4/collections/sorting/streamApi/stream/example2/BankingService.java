package day4.collections.sorting.streamApi.stream.example2;

import day4.collections.sorting.streamApi.stream.example2.model.BankAccount;
import day4.collections.sorting.streamApi.stream.example2.model.CurrentAccount;

public interface BankingService {

    void doDeposit(BankAccount bankAccount, int amount);

    void doWithdrawal(CurrentAccount ca, int i);

    class BankingServiceImplementation {
    }
}
