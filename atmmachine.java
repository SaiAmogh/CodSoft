package javaproject;
import java.util.*;
interface AtmInterface{
    public void withdrawAmount(int amount);
    public void depositAmount(int amount);
    public void checkAccountBalance();
}

class BankUser implements AtmInterface
{

    private int accountBalance, atmPin;
    public String customerName;
    
    public static int minimumBalance = 1500;
    public static int withdrawLimit = 20000;
    
    BankUser(String customerName, int accountBalance, int atmPin)
    {
        this.customerName = customerName;
        this.accountBalance = accountBalance;
        this.atmPin = atmPin;
    }

// Method for withdrawing amount
    public void withdrawAmount(int amount)
    {
        
        if(amount > withdrawLimit)
        {
            System.out.println("Sorry, Withdraw limit Exceeded. \n");
            return;
        }
        else if(accountBalance - amount < minimumBalance)
        {
            System.out.println("Sorry, Insufficient Funds. \n");
            return;
        }
        accountBalance -= amount;
        System.out.println("Rs."+amount+" has been successfully withdrawn from your account. \n");
    }

 // Method for depositing amount
    public void depositAmount(int amount)
    {
        System.out.println("Rs."+amount+" has been successfully deposited into your account. \n");
        accountBalance += amount;
        this.checkAccountBalance();
    }

// Method for checking the account balance
    public void checkAccountBalance()
    {
        System.out.println("Your remaining balance is Rs."+accountBalance+". \n");
    }
}
public class atmmachine 
{
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        BankUser user = new BankUser("John", 8000, 1234);
        while (true) {
            System.out.println("\n***ATM INTERFACE***\n");
            System.out.println("1. Withdraw Amount\n");
            System.out.println("2. Deposit Amount\n");
            System.out.println("3. Check balance\n");
            System.out.println("Enter your choice:");
            int choice = input.nextInt();
            switch(choice){
                case 1: System.out.println("Enter the amount you want to withdraw:");
                        int amount = input.nextInt();
                        user.withdrawAmount(amount);
                        break;
                case 2: System.out.println("Enter the amount you want to deposit:");
                        int amt = input.nextInt();
                        user.depositAmount(amt);
                        break;
                case 3: user.checkAccountBalance();
                        break;
                default:System.exit(0);
            }
        }
    }
}