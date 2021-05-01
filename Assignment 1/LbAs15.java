//Asignment 1 Q.15 : Swap Numbers

import java.util.*;

 class LbAs15 {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter 2 numbers Before Swapping");
		System.out.println(a);
		System.out.println(b);
		a = a + b;
		b = a-b;
		a = a-b;
		System.out.println("Enter 2 numbers After Swapping");
		System.out.println(a);
		System.out.println(b);
	}
}