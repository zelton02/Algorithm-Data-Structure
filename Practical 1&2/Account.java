public class Account {
    private Double balance;
    private Integer id;
    private Double annualInterestRate;

    public Account(){}

    public Account (Double balance, Integer id, Double annualInterestRate){
        this.balance = balance;
        this.id = id;
        this.annualInterestRate = annualInterestRate;
    }

    public void deposit(Double amount){
        balance += amount;
    }
    
    public void withdraw(Double amount){
        balance -= amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getAnnualInterest(){
        return this.annualInterestRate;
    }

}