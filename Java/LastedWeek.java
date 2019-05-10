import java.util.*;

 //Compiler version JDK 11.0.2

 class Dcoder
 { 	
 	public static void main(String args[])
 	{
 		int waterTank = 10000;
 		
 		int consumedWaterPerWeek, lastedWeek;
 		
 		Scanner scan = new Scanner(System.in);
 		
 		consumedWaterPerWeek = scan.nextInt();
 		
 		lastedWeek = waterTank / consumedWaterPerWeek;
 		
 		System.out.println(lastedWeek);
 	}
 }