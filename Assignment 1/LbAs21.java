//Asignment 1 Q.21: Decimal To Octal
import java.util.*;

class LbAs21 {
	public static void main(String args[]){
		//take input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Decimal Number: ");
		int a = sc.nextInt();
		
		sc.close();
		//process
		
		
		int i = 0;
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
