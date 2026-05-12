
    public class BankAccount {

        // Variable to store balance
        double balance;

        // Constructor
        BankAccount(double initialBalance) {
            balance = initialBalance;
        }

        // Deposit Method
        void deposit(double amount) {

            if (amount > 0) {

                balance += amount;

                System.out.println("Amount Deposited: " + amount);

            } else {

                System.out.println("Invalid Deposit Amount!");
            }
        }

        // Withdraw Method
        void withdraw(double amount) {

            if (amount <= balance) {

                balance -= amount;

                System.out.println("Amount Withdrawn: " + amount);

            } else {

                System.out.println("Insufficient Balance!");
            }
        }

        // Check Balance Method
        void checkBalance() {

            System.out.println("Current Balance: " + balance);
        }
    }

