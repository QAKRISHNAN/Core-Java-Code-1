package CoditionalStatements;

import java.util.Scanner;

public class ATM_Switch 
{

	public static void main(String[] args) 
	{
		//declare and initialize balance, withdraw, and deposit  
        int balance = 6000, withdraw, deposit;  
          //6000>=9000 F 6000>=2000 T
        //create scanner class object to get choice of user  
        Scanner sc = new Scanner(System.in);  
          
       //while(true)  
        //{  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT"); 
            
            System.out.print("Choose the operation you want to perform:");  
              
            //get choice from user  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
                      
        //get the withdrawl money from user  
        withdraw = sc.nextInt();  //2000
                      
        //check whether the balance is greater than or equal to the withdrawal amount  
        if(balance >= withdraw)  //5000>=2000 true false 
        {   
        	
        	
            //remove the withdrawl amount from the total balance  
            balance = balance - withdraw; //-= b=5000-2000=3000
            System.out.println("Your Current Balance: "+balance );
            System.out.println("Please collect your money"); 
            
            
        }  //4000=6000-2000
        else  
        {  
            //show custom error message   
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
        //get deposite amount from te user  
        deposit = sc.nextInt();  
      
        //add the deposit amount to the total balanace  
        balance = balance + deposit;  //+= 5000 + 3000=8000
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("Your Current Balance: "+balance );
         System.out.println("");
         break;  
   
                case 3:  
        //displaying the total balance of the user  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:  
        //exit from the menu  
        System.exit(0);
        
                default:
                	System.out.println("Choose only 1 to 4");
            } 
            
        } 
        
	}

//}
