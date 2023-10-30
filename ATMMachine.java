import java.util.*;

class ATM{
    float Balance=200000;
    int PIN=2000;

    public void CheckPin(){
        System.out.println("enter Your Pin:");
        Scanner sc=new Scanner(System.in);
        int enterpin=sc.nextInt();
        if(enterpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter the valid PIN :");
            menu();
        }

    }
    public void menu(){
        System.out.println("Enter your choice:");
        System.out.println("1:Check Account Balance");
        System.out.println("2:Withdraw the Money");
        System.out.println("3:Deposit Money:");
        System.out.println("Exit");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        if(option==1){
            CheckBalance();
        }
        else if(option==2){
            WithdrawMoney();
        }
        else if(option==3){
            DepositMoney();
        }
        else if(option==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice:");
        }

    }
    public void CheckBalance(){
        System.out.println("Balance:"+ Balance);
        menu();
    }
    public void WithdrawMoney(){
        System.out.println("Enter the Amount:");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        if(amount>Balance){
            System.out.println("Insufficient Blanace:");
        }
        else{
            Balance=Balance-amount;
            System.out.println("Money withdraw Succesfully:");
        }
        menu();
    }
    public void DepositMoney(){
        System.out.println("Enter the amount you want to add:");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Successfully deposit:");
        menu();
    }
}
public class ATMMachine {
    public static void main(String[]args){
        ATM obj=new ATM();
        obj.CheckPin();
    }
}
