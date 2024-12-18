package Encapsulation;

public class AccountDetails 
{
	//Inside Package Inside Class
		//private data members 
		//Encapsulation Program
		private long accountnum;  //Non-Static Variable
		private String name;
		private String bank;  
		private float amount; 
		
		
		//public getter and setter methods 
		
		//Account Number
		public long getAccountnum()   //With return type without parameters
		{  
			
		   return accountnum;  
		}  
		
		public void setAccountnum(long accountnum) 
		
		// without return type with parameter
		
		{  
			
		    this.accountnum = accountnum;
		    
		    } 
		//Customer Name
		public String getName() 
		//With return type without parameters
		{  
		    return name;  
		}  
		
		public void setName(String name) 
		
		//Without return type with parameters
		{  
		    this.name = name; 
		}  
		
		//Bank Name
		
		public String getBank() 
		{  
		    return bank;  
		}  
		
		public void setBank(String bank) 
		{  
		    this.bank= bank;
		}  
		
		//Amount
		public float getAmount() 
		{  
		    return amount;  
		}  
		
		public void setAmount(float amount) 
		{  
		    this.amount = amount;  
		   
		}
}
