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

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "(000) 987-2345");
        System.out.println(timsAccount.getAccountNumber() + " => Owner's name of the Account : " + timsAccount.getCustomerName());

        VipCustomer vipJohn = new VipCustomer();
        System.out.println(vipJohn.getName() + "'s Account info : $" + vipJohn.getCreditLimit() + " limit (" + vipJohn.getEmailAddress() + ")");

        VipCustomer vipCho = new VipCustomer("Cho", 1000.00);
        System.out.println(vipCho.getName() + "'s Account info : $" + vipCho.getCreditLimit() + " limit (" + vipCho.getEmailAddress() + ")");

        VipCustomer vipLin = new VipCustomer("Lin", 5000.00, "lin@vip.com");
        System.out.println(vipLin.getName() + "'s Account info : $" + vipLin.getCreditLimit() + " limit (" + vipLin.getEmailAddress() + ")");

    }
}
