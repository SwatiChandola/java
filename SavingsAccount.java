class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}
class SavingsAccount {
    private String accountNumber;
    private double balance;
    SavingsAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void depositAmount(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into account " + accountNumber);
    }
    void withdrawAmount(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal amount exceeds available balance");
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + " from account " + accountNumber);
    }
    double getBalance() {
        return balance;
    }
    String getAccountNumber() {
        return accountNumber;
    }
}
class SavingsAccountExample {
    public static void main(String[] args) {
        System.out.println("Swati");
        SavingsAccount myAccount = new SavingsAccount("123456789", 1000);
        try {
            myAccount.withdrawAmount(500);
            myAccount.withdrawAmount(700); // This should throw an exception
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Balance in account " + myAccount.getAccountNumber() + ": " + myAccount.getBalance());
    }
}