// type1 Pattern 13


public class Pattern13Type1 {
	public static void main(String args[]){
		
		int a = 65;
		
		for(int i=1;i<=5;i++){
			
			for(int k=4; k>=i;k--){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print( (char)(a + (i-1)) +" ");
			}
			
			System.out.println();
		}
		
	}
}