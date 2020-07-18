import java.util.Scanner;


//**********************************************************
//	Java				Author: Tracy
//						Date: July 17, 2020
//**********************************************************

public class DistCalc {
//This program reads coordinates for two points then computes the distance between them
	
	public static void main(String[] args) {
		
		int x1;
		int x2;
		int y1;
		int y2;
		double dist;
		String total;
				
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number for X1: ");
		x1 = scan.nextInt();
		
		System.out.print("Enter the number for X2: ");
		x2 = scan.nextInt();
		
		System.out.print("Enter the number for Y1: ");
		y1 = scan.nextInt();
		
		System.out.print("Enter the number for Y2: ");
		y2 = scan.nextInt();
		
		dist = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		
		total = String.format("%.3f", dist);
		System.out.println("Total distance between: " + total);
		
		scan.close();
		
		
	}

}
