//Assignment 2 Pyradmid Pattern 4

public class PyradmidPattern4 {
	public static void main(String args[]){
		
		for(int i=1;i<=9;i++){
			
			for(int k=8;k>=i;k--){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			
			for(int l=i; l>1;l--){
				System.out.print(l);
			}
			
			System.out.println();
		}
		
		
	}
}