// type1 Pattern 12


public class Pattern12Type1 {
	public static void main(String args[]){
		
		
		for(int i=1;i<=5;i++){
			
			for(int k=4; k>=i;k--){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print( i +" ");
			}
			
			System.out.println();
		}
		
	}
}