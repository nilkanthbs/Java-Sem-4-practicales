class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayBalance();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
        displayBalance();
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    public SavingsAccount(double initialBalance, double withdrawalLimit) {
        super(initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn from Savings: $" + amount);
        } else {
            System.out.println("Withdrawal limit exceeded or insufficient funds for withdrawal.");
        }
        displayBalance();
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalFee;

    public CheckingAccount(double initialBalance, double withdrawalFee) {
        super(initialBalance);
        this.withdrawalFee = withdrawalFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= (amount + withdrawalFee);
            System.out.println("Withdrawn from Checking: $" + amount + " (including fee: $" + withdrawalFee + ")");
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
        displayBalance();
    }
}
public class practical21 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 500);
        savingsAccount.withdraw(200);
        savingsAccount.deposit(300);

        CheckingAccount checkingAccount = new CheckingAccount(1500, 20);
        checkingAccount.withdraw(100);
        checkingAccount.deposit(200);
    }
}