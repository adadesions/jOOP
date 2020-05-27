package problems;

public interface CoreAccount {
    public void credit(double amount);
    public void debit(double amount);
    public double getBalance();
}
