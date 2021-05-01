//Asignment 1 Q.11: area and perimeter of circle

import java.util.*;


class LbAs11 {
	public static void main(String args[]){
		//initialization
		float pi =  3.141592653589793238F;
		Scanner sc = new Scanner(System.in);
		
		//take input
		System.out.println("Enter Radius of Circle: ");
		float r = sc.nextFloat();
		
		//perform Area
		float area = pi * r * r;
		
		//perform perimeter
		float peri = 2 * pi * r;
		
		//output
		System.out.println("Area of Circle: " + area);
		System.out.println("Perimeter of Circle: " + peri);
		
		sc.close();
	}
}
