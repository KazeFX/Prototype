
public class Account {

    private String name; // Instance variable
    private double balance = 0.0;


    public Account(){}

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }


    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            this.balance = this.balance + depositAmount;
        }
    }

    public void withdraw(double withdrawAmount) {

        if (withdrawAmount <= this.balance) {
            this.balance = this.balance - withdrawAmount;
            System.out.printf("You have withdrawn $%.2f. Remaining funds: $%.2f", withdrawAmount, this.balance);
        }
        else {
            System.out.println("Amount invalid. Check your balance.");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
