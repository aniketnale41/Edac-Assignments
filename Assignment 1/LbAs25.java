//Asignment 1 Q.25: Octal To Decimal
import java.util.*;

class LbAs25 {
	public static void main(String args[]){
		//take input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Octal Number: ");
		int a = sc.nextInt();
		
		sc.close();
		//process
		
		// 1. Binary to Decimal
		int i = 0;
		int d =0;
		while(a!=0){
			int k = a%10;
			double power = Math.pow(8,i);
			d = d + (k* (int)power);
			a= a/10;
			i++;
		}
		
		
		System.out.println(d);
		
		
	}
}
