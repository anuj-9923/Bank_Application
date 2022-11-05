public interface Bank {
    void addMoney(int money);
    boolean checkBalance();
    int withdrawnMoney(int money);
    double rateOfInterest(int year);

}
