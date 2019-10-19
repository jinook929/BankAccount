package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount();
        bobsAccount.setAccountNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setEmail("myemail@bob.com");
        bobsAccount.setPhoneNumber("(087) 123-4567");

        System.out.println("Bob's Account # : " + bobsAccount.getAccountNumber());
        System.out.println("Bob's Balance : " + bobsAccount.getBalance());

        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdraw(100.0);

        BankAccount jungsAccount = new BankAccount("13579", 0.00, "Jinook Jung", "jjo@jung.com", "(123) 456-7890");
        System.out.println("Jung's Account # : " + jungsAccount.getAccountNumber());
        System.out.println("Jung's Balance : " + jungsAccount.getBalance());

//        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");
//        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());
    }
}
