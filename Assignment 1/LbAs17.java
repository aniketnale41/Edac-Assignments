//Asignment 1 Q.17: Addition of binary
import java.util.*;

class LbAs17 {
	public static void main(String args[]){
		//take input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Binary Number: ");
		long a = sc.nextLong();
		System.out.print("Enter Second Binary Number: ");
		long b = sc.nextLong();
		int carry = 0;
		int extra = 0;
		sc.close();
		int[] sum = new int[10];
		int i = 0;
		// int length = String.valueOf(a).length();
		//calculate
		// for(int i=0;i<length)
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
		//output
		while (i>=0){
			System.out.print(sum[i]);
			i--;
		}
	}
}
