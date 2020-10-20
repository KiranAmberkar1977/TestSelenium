package MyExample;

public class MyNestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String Branch = "CCE"; 
		        int year = 2; 
		  
		        switch (year) { 
		        case 1: 
		            System.out.println("elective courses : Advance english, Algebra"); 
		            break; 
		        case 2: 
		            switch (Branch) // nested switch 
		            { 
		            case "CSE": 
		            case "CCE": 
		                System.out.println("elective courses : Machine Learning, Big Data"); 
		                break; 
		            case "ECE": 
		                System.out.println("elective courses : Antenna Engineering"); 
		                break; 
		            default: 
		                System.out.println("Elective courses : Optimization"); 
		            } 
		      }
		        
		      switch(Branch) {
		      	case "CCE":
		      		System.out.println("This is CCE");
		      		break;
		      	case "CSE":
		      		System.out.println("This is CSE");
		      		break;	
		      	default:
		      		System.out.println("This is not a recognized stream.");
		      		break;
		      }
		} 
} 
	