//Asignment 1 Q.19: Decimal To Binary
import java.util.*;

class LbAs19 {
	public static void main(String args[]){
		//take input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Decimal Number: ");
		int a = sc.nextInt();
		
		sc.close();
		//process
		
		int[] b= new int[20];
		int i = 0;
		
		while(a!=0){
			
			if(a%2 == 0){
				b[i] = 0;
			} else {
				b[i] = 1;
			}
				a= a/2;
			i++;	
		}
		i--;
		while (i>=0){
			
			System.out.print(b[i]);
			
			i--;
		}
		
		
	}
}
