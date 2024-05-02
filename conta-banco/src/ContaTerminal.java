import java.util.Scanner;

public class ContaTerminal {
    private static int accountNumber;
    private static String agency;
    private static String customerName;
    private static double balance;

    public static void main (String[] args) throws Exception {
        getInfo();
        displayAccountDetails();
    }

    private static void getInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert account number: ");
        accountNumber = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Insert agency number: ");
        agency = scanner.nextLine();
        
        System.out.println("Insert customer name: ");
        customerName = scanner.nextLine();

        System.out.println("Insert current balance: ");
        balance = scanner.nextDouble();

        scanner.close();
    }
    private static void displayAccountDetails() {
        System.out.println("Hi " + customerName + ", thanks for creating an account with us, your agency is " + agency +", account number " + accountNumber + " and your current balance is " + balance + ", already available to withdraw");
    }
}