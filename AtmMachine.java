import java.util.*;
class ATM{
    float Balance;
    int PIN = 0;

    //Create Pin
    public void creatpin(){
        System.out.println("Enter the New Pin : ");
        Scanner sc = new Scanner(System.in);
        int newPin = sc.nextInt();
        PIN = newPin;
        checkpin();
    }

    //check Pin Function
    public void checkpin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Pin : ");
        int enterpin = sc.nextInt();

        if(enterpin == PIN){
            menu();
        }else{
            System.out.println("Enter the Valid Pin");
        }
        checkpin();
    }

    public void changepin(){
        System.out.println("Enter the New Pin to Change :");
        Scanner sc = new Scanner(System.in);
        int changpin = sc.nextInt();
        PIN = changpin;
        checkpin();
    }

    //Creating Menu Function
    public void menu(){
        System.out.println("Enter the Choice : ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Change Pin");
        System.out.println("5. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        }else if(opt == 2){
            withdrawMoney();
        }else if(opt == 3){
            depositMoney();
        }
        else if(opt == 4){
            changepin();
        }
        else if(opt == 5){
            return;
        }else{
            System.out.println("Enter the Valid Choice");
        }
    }

    public void checkBalance(){
        System.out.println("Balance : " + Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter Amount to Withdraw : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > Balance){
            System.out.println("Insufficient Balance");
        }else{
            Balance = Balance - amount;
            System.out.println("Money Withdraw Succesfully");
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the amount to deposit : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextInt();

        Balance = amount + Balance;
        System.out.println("Money Diposit Succesfully");
        menu();
    }


}

public class AtmMachine {
    public static void main(String[] args){

        ATM obj = new ATM();
        obj.creatpin();

    }
}
