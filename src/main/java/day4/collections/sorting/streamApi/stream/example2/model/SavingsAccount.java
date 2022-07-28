package day4.collections.sorting.streamApi.stream.example2.model;

public class SavingsAccount extends BankAccount {


    public SavingsAccount(int id, String accountHolderName, int balance) {
        super(id, accountHolderName, balance);
    }

    public SavingsAccount() {
        super();
    }

    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdrawal(int amount) {
        int balance = super.getBalance();

        if (balance < 5000 | (balance - amount) < 5000) {
            System.out.println("balance cannot be updated");
        }
    }
}
