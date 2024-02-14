public class Account {
    private String num;
    private double balance;

    public Account(String num, double balance) {
        this.num = num;
        this.balance = balance;
    }

    public Account(String num) {
        this(num, 0);
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
