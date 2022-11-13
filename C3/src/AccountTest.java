import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Account account = new Account();
        Account account1 = new Account("Johnny Quest", 1337.0);

        Scanner input = new Scanner(System.in);

        System.out.printf("Previous account belongs to: %s with $%.2f%n", account1.getName(), account1.getBalance());

        System.out.print("Enter account holder: ");
        account.setName(input.nextLine());
        System.out.print("How much do you want to deposit?: ");
        account.deposit(input.nextDouble());
        System.out.printf("Account belongs to: %s with $%.2f%n", account.getName(), account.getBalance());
        System.out.print("How much do you wish to withdraw?");
        account.withdraw(input.nextDouble());
        System.exit(0);
    }

}
