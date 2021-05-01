//Asignment 1 Q.20: Decimal To Hexadecimal
import java.util.*;

class LbAs20 {
	public static void main(String args[]){
		//take input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Decimal Number: ");
		int a = sc.nextInt();
		
		sc.close();
		//process
		
		
		int i = 0;
		String[] results = new String[10];
		
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
