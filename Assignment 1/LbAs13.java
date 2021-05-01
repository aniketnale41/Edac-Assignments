//Asignment 1 Q.13: area and perimeter of rectangle

import java.util.*;


class LbAs13 {
	public static void main(String args[]){
		//initialization
		
		Scanner sc = new Scanner(System.in);
		
		//take input
		System.out.println("Enter Width of Rectangle: ");
		float w = sc.nextFloat();
		System.out.println("Enter Height of Rectangle: ");
		float h = sc.nextFloat();
		
		//perform Area
		float area = w*h;
		
		//perform perimeter
		float peri = 2*(w+h);
		
		//output
		System.out.println("Area is " + w + "*" + h + " = " + area);
		System.out.println("Perimeter is 2 * (" + w + "+" + h + ") = " + peri);
		
		sc.close();
	}
}
