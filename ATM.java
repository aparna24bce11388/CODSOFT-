
    import java.util.Scanner;

    public class ATM {

        public static void main(String[] args) {

            // Scanner object for user input
            Scanner sc = new Scanner(System.in);

            // Create BankAccount object with initial balance
            BankAccount account = new BankAccount(1000);

            int choice;

            // ATM menu loop
            do {

                // Display ATM options
                System.out.println("\n===== ATM MENU =====");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");

                // Take user choice
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                // Perform operation based on user choice
                switch (choice) {

                    // Deposit Option
                    case 1:

                        System.out.print("Enter amount to deposit: ");

                        double depositAmount = sc.nextDouble();

                        account.deposit(depositAmount);

                        break;

                    // Withdraw Option
                    case 2:

                        System.out.print("Enter amount to withdraw: ");

                        double withdrawAmount = sc.nextDouble();

                        account.withdraw(withdrawAmount);

                        break;

                    // Check Balance Option
                    case 3:

                        account.checkBalance();

                        break;

                    // Exit Option
                    case 4:

                        System.out.println("Thank You for Using ATM!");

                        break;

                    // Invalid Choice
                    default:

                        System.out.println("Invalid Choice!");
                }

            } while (choice != 4);

            // Close scanner
            sc.close();
        }
    }

