import java.util.*;

 //Compiler version JDK 11.0.2

 class Dcoder
 {
 	public static void main(String args[])
 	{ 
 		int number;
 		
 		Scanner input=new Scanner(System.in);
 		number = input. nextInt();
 		
 		int total=0;
 		
 		for(; number>0; number--) {
 			total+=number;
 		}
 		
 		System.out.println(total);
 	}
 }
