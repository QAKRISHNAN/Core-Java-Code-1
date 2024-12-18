package Encapsulation;

public class AccountTest 
{

	public static void main(String[] args)
	{  
		//Inside Package OutSide Class
		//Bank Employee
	    //Creating object of AccountDetails  class 
		
	    AccountDetails acc=new AccountDetails(); 
	    
	    //setting values through setter methods
	    
	    acc.setAccountnum(12345678L);
	    acc.setName("Krishna");  
	    acc.setBank("HDFC");  
	    acc.setAmount(460000.5f); 
	    
	    
	    
	    //getting values through getter methods
	    
	    System.out.println(acc.getAccountnum());
	    System.out.println(acc.getName());
	    System.out.println(acc.getBank());
	    System.out.println(acc.getAmount());
	    
	}  

}
