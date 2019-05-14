import java.util.*;

 //Compiler version JDK 11.0.2


 class Dcoder
 {
 	public static double shortestpath(int x, int y) 
 	{
 		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
 	}
 	
 	public static void main(String args[])
 	{
 		int Ax, Ay, Bx, By;
 		double Apath, Bpath;
 		
 		Scanner scan = new Scanner(System.in);
 		
 		Ax= scan.nextInt();
 		Ay= scan.nextInt();
 		Bx= scan.nextInt();
 		By= scan.nextInt();
 		
 		Apath = shortestpath(Ax, Ay);
 		Bpath = shortestpath(Bx, By);
 		
 		if (Apath < Bpath) {         // which one is short 
 			System.out.println("A");
 		}
 		else {
 			System.out.println("B");
 		}
 	}
 }