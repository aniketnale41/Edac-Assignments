// Star Pattern 9


public class StarPattern9 {
	public static void main(String args[]){
		
		
		for(int i=1;i<=5;i++){
			
			for(int k=4;k>=i;k--){
				System.out.print(" ");
			}
			
			for(int j=i;j>=1;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++){
			
			for(int k=i;k>=1;k--){
				System.out.print(" ");
			}
			
			for(int j=4;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}