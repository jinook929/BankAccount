package academy.learnprogramming;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer() {
        this("John", 3000.00, "john.doe@vip.com");
        System.out.println("Empty constructor called");
//        this.name = "John";
//        this.creditLimit = 3000.00;
//        this.emailAddress = "john.doe@vip.com";
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "No email");
//        this.name = name;
//        this.creditLimit = creditLimit;
    }
}
