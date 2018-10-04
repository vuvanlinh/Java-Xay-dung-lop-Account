import java.util.Date;

public class Account {
    private int id = 0;
    private double ballance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    public Account() {

    }

    public Account(int id, double ballance, double annualInterestRate) {
        this.id = id;
        this.ballance = ballance;
        this.annualInterestRate = annualInterestRate;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setballance(double ballance) {
        this.ballance = ballance;
    }

    public double getballance() {
        return this.ballance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return ballance * this.getMonthlyInterestRate() / 100;
    }

    public void withdraw(double withdrawMoney) {
        this.ballance = this.ballance - withdrawMoney * this.annualInterestRate / 100;
    }

    public void deposite(double depositeMoney) {
        this.ballance = this.ballance + depositeMoney;
    }


}
