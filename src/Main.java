import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SBI sbi=new SBI();
        int n1=0;
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 0 to Add Money");
            System.out.println("Enter 1 to checkBalance");
            System.out.println("Enter 2 to withdraw the amount");
            System.out.println("Enter 3 to Interest Rate Amount");
            System.out.println("For exist 4");
            int n=sc.nextInt();
            switch (n){
                case 0:
                    System.out.println("Enter amount: ");
                    int amount=sc.nextInt();
                    sbi.addMoney(amount);
                    break;
                case 1:
                    sbi.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter amount: ");
                    amount=sc.nextInt();
                    int amount1=sbi.withdrawnMoney(amount);
                    System.out.println("Withdrawn Amount: "+amount1);
                    break;
                case 3:
                    System.out.println("Enter time in year");
                    int time=sc.nextInt();
                    double interest=sbi.rateOfInterest(time);
                    System.out.println(interest);
                    break;
                case 4:
                    n1=-1;
                    break;
                default:
                    System.out.println("Incorrect! Choose correct option");
            }
        }while (n1!=-1);
    }
}
