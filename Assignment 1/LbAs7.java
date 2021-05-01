//Asignment 1 Q.7: Write a Java program that takes a number as input and prints its multiplication
//table upto 10. 

import java.util.*;

 class LbAs7 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = sc.nextInt();
		for (int i=0;i<10;i++){
			int r = i+1;
			int q = r*a;
			System.out.println(a + " X "+ r + " = " + q);
		}
	}
	
}