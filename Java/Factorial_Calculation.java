import java.util.*;

 //Compiler version JDK 11.0.2
  

 class Dcoder
 {
 	public static int factorial(int x){
 		if (x == 0) {
 			return 1;
 		}
 		return x * factorial(x-1);
 	}
 	
 	public static void main(String args[])
 	{
 		Scanner scan = new Scanner(System.in);
 		int input = scan.nextInt();
 		
 		System.out.println(factorial(input));
 	}
 }