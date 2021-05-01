//Asignment 1 Q.5: takes two numbers as input and display the product

import java.util.*;

class LbAs5 {
	public static void main(String []args) {
	
	//init
	int a,b,product;
	Scanner sc = new Scanner(System.in);
	
	//take inputes
	System.out.println("Enter First Number: ");
	a = sc.nextInt();
	System.out.println("Enter Second Number: ");
	b = sc.nextInt();
	
	//multiply
	product = a * b;
	
	//output
	System.out.println( a + " x "+ b +" = " + product);
	
	sc.close();
	}
}
