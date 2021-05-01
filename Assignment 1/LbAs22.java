//Asignment 1 Q.22: Binary To Decimal
import java.util.*;
import java.lang.*;

class LbAs22 {
	public static void main(String args[]){
		//take input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Binary Number: ");
		int a = sc.nextInt();
		
		sc.close();
		//process
		int i = 0;
		int temp =0;
		while(a!=0){
			int k = a%10;
			double power = Math.pow(2,i);
			temp = temp + (k* (int)power);
			a= a/10;
			i++;
		}
		System.out.println(temp);
	}
}
