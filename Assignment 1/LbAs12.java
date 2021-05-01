//Assignment 1 Q.12: Average

import java.util.*;

class LbAs12 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Numbers: ");
		float a = sc.nextInt();
		float b = sc.nextInt();
		float c = sc.nextInt();
		float avg = (a+b+c)/3;
		System.out.println("Average of given 3 Numbers is: " + avg);
	
	}
}