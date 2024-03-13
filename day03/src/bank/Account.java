package bank;

public class Account {
    // Attributes
    private String accNum;
    private String custName;
    private long balance;
    private double interest;

    // Constructors
    public Account() {
        // Default constructor logic (if any)
    }

    public Account(String accNum, String custName, long balance, double interest) {
        this.accNum = accNum;
        this.custName = custName;
        if(balance < 0){
            System.out.println("잔액은 0 이상이 입력되어야 합니다.");
            return;
        }
        this.balance = balance;
        this.interest = interest;
    }

    // Methods
    public void deposit(long money) {
        if(money <= 0) {
            return; //Exception
        }
        this.balance += money;
    }

    public void withdraw(long money) {
        if(money <= 0 || this.balance < money){
            return;
        }
        this.balance -= money;
    }

    public double getCalInterest() {
        // Calculate interest
        return balance * interest / 100;
    }

    public int getCalInterest(int month) {
        return (int) (this.getCalInterest());
    }

    // Getters and Setters
    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNum='" + accNum + '\'' +
                ", custName='" + custName + '\'' +
                ", balance=" + balance +
                ", interest=" + interest +
                '}';
    }
}
