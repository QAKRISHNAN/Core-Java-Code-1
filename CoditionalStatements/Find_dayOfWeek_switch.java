package CoditionalStatements;

public class Find_dayOfWeek_switch 
{

	public static void main(String[] args) 
	{
		//int dayOfWeek = 2;
		
		char dayOfWeek='t';
		
		switch (dayOfWeek) {
		  case 'M':
		    System.out.println("Monday");
		    break;
		  case 'm':
			    System.out.println("Monday");
			    break;
		  case 'T':
		    System.out.println("Tuesday");
		    break;
		  case 't':
			    System.out.println("Tuesday");
			    break;
			    
		  case 'W':
		    System.out.println("Wednesday");
		    break;
		  case 'H':
		    System.out.println("Thursday");
		    break;
		  case 'F':
		    System.out.println("Friday");
		    break;
		  case 'S':
		    System.out.println("Saturday");
		    break;
		  case 'U':
		    System.out.println("Sunday");
		    break;
		  default:
		    System.out.println("Invalid day of the week");
		}
	}

}
