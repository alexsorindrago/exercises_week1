package day4.collections.sorting.streamApi.stream.example2.model;

public abstract class BankAccount {

    private int id;
    private String accountHolderName;
    private int balance;

    public BankAccount(int id, String accountHolderName, int balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public BankAccount() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public abstract void deposit(int amount);

    public abstract void withdrawal(int amount);
}
