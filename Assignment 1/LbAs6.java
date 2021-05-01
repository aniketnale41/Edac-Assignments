//Asignment 1 Q.6: Write a Java program to print the sum (addition), multiply, subtract, divide and
//remainder of two numbers. 

import java.util.*;

class LbAs6 {
	public static void main(String []args) {
	
	//init
	int a,b,product, sum, division, sub, mod;
	Scanner sc = new Scanner(System.in);
	
	//take inputes
	System.out.println("Enter First Number: ");
	a = sc.nextInt();
	System.out.println("Enter Second Number: ");
	b = sc.nextInt();
	
	//operations
	product = a * b;
	sum = a + b;
	division = a/b;
	sub = a - b;
	mod = a % b;
	
	//output
	System.out.println( a + " + "+ b +" = " + sum);
	System.out.println( a + " - "+ b +" = " + sub);
	System.out.println( a + " x "+ b +" = " + product);
	System.out.println( a + " / "+ b +" = " + division);
	System.out.println( a + " mod "+ b +" = " + mod);
	
	
	sc.close();
	}
}
