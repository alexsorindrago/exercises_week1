package day1;

public class Application {

    public static void main(String[] args) {
        ContactDetails details = new ContactDetails("house1", "locality1", "city1", "state1", "country1", 1234, 5678, 1);
        KYCVerification verification = new KYCVerification("one", 2, "passport", "three3");

        Account account = new Account(1L, "john", "snow", 5000, verification, details);

        account.getBalance();
        System.out.println("initial balance: " + account.getBalance());
        account.deposit(100);
        System.out.println("balance after 100 deposit is:" + account.deposit(100));
        account.withdraw(100);
        System.out.println("your new balance is: " + account.withdraw(100));
        account.withdraw(200);
        System.out.println("could not withdraw money below 5000 limit on account. your balance is: " + account.withdraw(200));

        submitUserDetails(account);

        printUserAllDetails(account);

        printUserContactDetails(account);

        printUserKYCDocumentDetails(account);

        printBalance(account);

        changeMobileNumber(account);

        changeEmailId(account);
    }

    private static void changeEmailId(Account account) {
        long emailId = 5;
        account.getContactDetails().setEmailId(emailId);
    }

    private static void changeMobileNumber(Account account) {
        long newMobileNumber = 555789;
        account.getContactDetails().setMobileNumber(newMobileNumber);
    }

    public static void submitUserDetails(Account account) {
        ContactDetails newContactDetails = new ContactDetails("house2", "locality2", "city2", "state2", "country2", 4321, 8765, 2);
        account.setContactDetails(newContactDetails);
    }

    public static void printUserAllDetails(Account account) {
        System.out.println(account);
    }

    public static void printUserContactDetails(Account account) {
        System.out.print(account.getContactDetails());
    }

    public static void printUserKYCDocumentDetails(Account account) {
        System.out.println(account.getKycVerification());
    }

    public static void printBalance(Account account) {
        System.out.println(account.getBalance());
    }
}
