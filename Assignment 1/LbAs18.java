//Asignment 1 Q.18: Multiplication of 2 binary Nos
import java.util.*;

class LbAs18 {
	public static void main(String args[]){
		//take input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Binary Number: ");
		long c = sc.nextLong();
		System.out.print("Enter Second Binary Number: ");
		long d = sc.nextLong();
		long tempA = c;
		long tempB  =d;
		int carry = 0;
		int extra = 0;
		sc.close();
		int[] result = new int[2];
		int[] sum = new int[20];
		int i = 0;
		
		//calculate
		

		while(tempB!=0){
			long lastDigitOfB = d%10;
			long multi = c * lastDigitOfB;
			result[i] = (int)multi + (10*i);
			i++;
			tempB = tempB/10;
		}
		i = 0;
		
		long a = result[0];
		long b = result[1];
		
		//binary addition
		while(a!=0 || b!=0){
			long lastDigitOfA = a%10;
			long lastDigitOfB = b%10;
			long add = lastDigitOfA+ lastDigitOfB + carry;
			if(add==0){
				carry = 0;
				sum[i] = 0;
				
			} else if( add == 1){
				
				carry = 0;
				sum[i] = 1;
			} else if( add == 2){
				carry = 1;
				sum[i] = 0;
				
			} else if(add == 3) {
				carry = 1;
				sum[i] = 1;
			}
			a = a/10;
			b = b/10;
			// System.out.println("add : "+add);
			// System.out.println("value of i at end start: "+i);
			add = 0;
			i++;
		}
		if(carry==1){
			sum[i++]= carry;
		}
		i--;
		//output
		while (i>=0){
			
				
			System.out.print(sum[i]);
			
			i--;
		}
	}
}
