// Star Pattern 14

public class StarPattern14 {
	public static void main(String args[]){
		
		for(int i=1;i<=5;i++){
			
			for(int k=i;k>1;k--){
				System.out.print(" ");
			}
			
			for(int j=5;j>=i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=2;i<=5;i++){
			
			for(int k=i;k<=4;k++){
				System.out.print(" ");
			}
			
			for(int j=i;j>=1;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}