import java.util.Scanner;

public class BankClass implements Bank{
    private int account_no;
    private String name;
    private String password;
    private int balance=0;
    private double interestRate;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void addMoney(int money) {
            balance+=money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean checkBalance() {
        System.out.println("Your account balance is: "+balance);
        return balance>0;

    }

    @Override
    public int withdrawnMoney(int money) {
        if(money<=balance){
            balance-=money;
            System.out.println("Remaining Balance is: "+balance);
            return money;
        }else{
            System.out.println("Sorry! Insufficient Balance");
            return 0;
        }
    }

    @Override
    public double rateOfInterest(int year) {
        return balance*interestRate*year/1000;
    }
}
class SBI extends BankClass{
    private int min_RequiredBal=3000;

    public void openAccount(int balance){
        if(balance<min_RequiredBal){
            System.out.println("Required Balance is 3000Rs to open SBI Account");
        }else{
            System.out.println("Successfully opened your account");
            setBalance(balance);

        }
    }
}
