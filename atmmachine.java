import java.util.*;

class Atm{
    float Balance;
    int PIN = 4444;
    public void checkpin(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin == PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin!");
            checkpin();
        }
    }
    public void menu(){
        System.out.println("Enter an option: ");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw cash");
        System.out.println("3. Deposit money");
        System.out.println("4. EXIT");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt ==1){
            Checkbalance();
        }
        else if(opt == 2){
            withdraw();
        }
        else if(opt == 3){
            deposit();
        }
        else if(opt ==4){
            return;
        }
    }
    public void Checkbalance(){
        System.out.println("Balance: " + Balance);
        menu();
    }
    public void withdraw(){
        System.out.println("Enter the amount to be withdrawn: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance - amount;
        if(amount>Balance){
            System.out.println("Insufficient Balance!!!");
        }
        else{
            System.out.println("Amount withdrawn successfully, Available balance: "+ Balance);
        }
        menu();
    }
    public void deposit(){
        System.out.println("Amount to be deposited: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Deposit successful, your Balace: "+Balance);
        menu();
    }


}


public class Atmmachine {
    public static void main(String[] args){
        Atm obj = new Atm();
        obj.checkpin();
    }
    
}
