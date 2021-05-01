// Asignment 1 Q.16 Print Face
 
 class LbAs16 {
	public static void main(String args[]){
		
		//first Line
		for(int i=0;i<9;i++){
			if (i==1 || i==7){
				System.out.print("+");
			} else if(i==0 || i==8){
				System.out.print(" ");
			}
			else {
				System.out.print('"');
			}
		}
		System.out.println("");
		
		//second Line
		for(int k=0;k<9;k++){
			if (k==1 || k==7){
				System.out.print("|");
			} 
			else if(k==0){
				System.out.print("[");
			}
			else if(k==8){
			System.out.print("]");
			}
			else if(k==3 || k==5){
				System.out.print("O");
			}
			else {
				System.out.print(' ');
			}
		}
		System.out.println("");
		
		//third line
		for(int k=0;k<9;k++){
			if (k==1 || k==7){
				System.out.print("|");
			} 
			else if(k==4){
				System.out.print("^");
			}
			else {
				System.out.print(' ');
			}
		}
		System.out.println("");
		
		//fourth line
		for(int k=0;k<9;k++){
			if (k==1 || k==7){
				System.out.print("|");
			} 
			else if(k==3 || k ==5 ){
				System.out.print("'");
			}
			else if(k==4){
				System.out.print("_");
			}
			else {
				System.out.print(' ');
			}
		}
		System.out.println("");
		
		//fourth Line
		for(int i=0;i<9;i++){
			if (i==1 || i==7){
				System.out.print("+");
			} else if(i==0 || i==8){
				System.out.print(" ");
			}
			else {
				System.out.print('-');
			}
		}
		System.out.println("");
		
	}
}