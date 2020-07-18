//**********************************************************
//	Java				Author: Tracy
//						Date: July 16, 2020
//**********************************************************

import java.util.Scanner;

public class NumDisplay {
//This program prompts user to enter a number between 0-9 and then displays the corresponding word

	
	public static void main(String[] args) {
		
		System.out.print("Enter at number between 0 and 9: ");
		
		int numGuess;	
		Scanner scan = new Scanner(System.in);
		numGuess = scan.nextInt();

		//switch statement allows a variable to be tested for equality against a list of values found in the Case below.
         switch (numGuess) {     

         
         case 0:
             	System.out.println("Zero");
             	break;

         case 1:
        	 	System.out.println("One");
        	 	break;
               
         case 2:
        	 	System.out.println("Two");
        	 	break;

         case 3:
        	 	System.out.println("Three");
        	 	break;
        	 	
         case 4:
        	 	System.out.println("Four");
        	 	break;

         case 5:
        	 	System.out.println("Five");
        	 	break;
           
         case 6:
        	 	System.out.println("Six");
        	 	break;

         case 7:
        	 	System.out.println("Seven");
        	 	break;
         
         case 8:
        	 	System.out.println("Eight");
        	 	break;
        	 	
         case 9:
     	 		System.out.println("Nine");
     	 		break;

         default:
        	 	System.out.println("Invalid number");
             scan.close();
             	break;
             
        }

	}

}
