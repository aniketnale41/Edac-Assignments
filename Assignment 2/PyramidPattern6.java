//Assignment 2 Pyradmid Pattern 6

public class PyramidPattern6 {
	public static void main(String args[]){
		
		for(int i=1;i<=9;i++){
			
			for(int k=1;k<i;k++){
				System.out.print(" ");
			}
			
			for(int j=9;j>=i;j--){
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
	}
}