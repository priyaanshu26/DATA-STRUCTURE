class BankAcc {
    String accNo;
    double balance;
    String name;

    public BankAcc(String accNo, double balance, String name) {
        this.accNo = accNo;
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printCustomerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: $" + balance);
        System.out.println();
    }

    public static void main(String[] args) {
        BankAcc account1 = new BankAcc("7867564534232", 500, "Ronak Nigga");
        account1.deposit(1000);
        account1.withdraw(600);
        account1.printCustomerDetails();
    }
}