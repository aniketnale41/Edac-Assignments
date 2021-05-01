//Asignment 1 Q.24: Binary to Octal
import java.util.*;

class LbAs24 {
	public static void main(String args[]){
		//take input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Binary Number: ");
		int a = sc.nextInt();
		
		sc.close();
		//process
		
		// 1. Binary to Decimal
		int i = 0;
		int d =0;
		while(a!=0){
			int k = a%10;
			double power = Math.pow(2,i);
			d = d + (k* (int)power);
			a= a/10;
			i++;
		}
		
		// 2. Decimal to Octal
		a =d;
		i = 0;
		int[] results = new int[10];
		
		while(a!=0){
			int r=0;
			r = a%8;
			
			results[i]= r;
			a = a/8;
			
			i++;
		}
		i--;
		
		//reverse order
		while (i>=0){
			System.out.print(results[i]);
			i--;
		}
		
		
	}
}
