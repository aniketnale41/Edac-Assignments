
//Asignment 1 Q.14: Print American Flag

 class LbAs14 {
	public static void main(String args[]){
		
		for(int k=0; k<9;k++)
			if(k%2==0){
					for(int i=0;i<6;i++){
						System.out.print("*");
						System.out.print(" ");
					}
					for (int l = 0; l<30; l++){
				System.out.print("=");
			}
			System.out.println("");
			}else {
				for(int i=0;i<5;i++){
					System.out.print(" ");
					System.out.print("*");	
				}
				System.out.print("  ");
				for (int r = 0; r<30; r++){
				System.out.print("=");
			}
				System.out.println("");
			}
			for (int k = 0; k<6; k++){
				for (int c = 0; c<42; c++){
				System.out.print("=");
			}
			System.out.println("");
			}

	}
}