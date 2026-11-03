public class BankAccount {
    private double balance = 5000;

    
    void withdraw(double amount) throws Exception {
        if (amount > balance) {
            
            throw new Exception("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        try {
            acc.withdraw(8000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}