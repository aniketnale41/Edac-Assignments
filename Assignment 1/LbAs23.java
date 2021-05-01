//Asignment 1 Q.23: Binary to HexaDecimal
import java.util.*;

class LbAs23 {
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
		
		// 2. Decimal to Hexa
		
		i = 0;
		String[] results = new String[10];
		a =d;
		while(a!=0){
			int r=0;
			r = a%16;
			//check for hexadecimal
			if(r>9){
				if(r==10)
					results[i]= "A";
				else if(r==11)
					results[i]= "B";
				else if(r==12)
					results[i]= "C";
				else if(r==13)
					results[i]= "D";
				else if(r==14)
					results[i]= "E";
				else if(r==15)
					results[i]= "F";
			} else {
				results[i] = String.valueOf(r);
			}
			a = a/16;
			
			i++;
		}
		i--;
		
		while (i>=0){
			System.out.print(results[i]);
			i--;
		}
		
	}
}
