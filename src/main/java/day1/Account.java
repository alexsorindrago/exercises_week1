package day1;

public class Account {

    private long accountNumber;
    private String username;
    private String password;
    private double balance;
    private int cashback;

    private KYCVerification kycVerification;
    private ContactDetails contactDetails;

    public Account(long accountNumber, String username, String password, double balance, KYCVerification kycVerification, ContactDetails contactDetails) {
        this.accountNumber = accountNumber;
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.kycVerification = kycVerification;
        this.contactDetails = contactDetails;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }

    public int getCashback() {
        return cashback;
    }

    public void setCashback(int cashback) {
        this.cashback = cashback;
    }

    public KYCVerification getKycVerification() {
        return kycVerification;
    }

    public void setKycVerification(KYCVerification kycVerification) {
        this.kycVerification = kycVerification;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    double deposit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    double withdraw(int amount) {
        this.balance -= amount;
        if (this.balance < 5000) {
            return 5000;
        } else return this.balance + (amount * 1.01);
    }

    @Override
    public String toString() {
        return "day1.Account{" +
                "accountNumber=" + accountNumber +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", cashback=" + cashback +
                ", kycVerification=" + kycVerification +
                ", contactDetails=" + contactDetails +
                '}';
    }
}
