//Asignment 1 Q.8: Print JAVA Text Pattern

 class LbAs8 {
	public static void main(String args[]){
		int num = 26;
		
		//first line
		printFirstLine();
		System.out.println("");
		//second line
		printSecondLine();
		System.out.println("");
		//third line
		printThirdLine();
		System.out.println("");
		//fourth line
		printFourthLine();
		
	}
	
	 static void printFourthLine(){
		for(int i=1;i<29;i++){
			if(i==2 || i==3){
				printJ();
			} 
			else if (i==6 || i== 12 || i==22 || i==28){
				printA();
			}
			else if (i==17){
				printV();
			}
			else {
				printSpace();
			}
		}
	}
	
	 static void printThirdLine(){
		for(int i=1;i<28;i++){
			if(i==1 || i==4){
				printJ();
			}
			else if (i==16 || i==18){
				printV();
			}
			else if (i==7 || i==8 || i==9  || i==10 || i==11 || i==27 || i==23 || i==24 || i==25|| i==26){
				printA();
			}
			else {
				printSpace();
			}
		}
	}
	
	 static void printFirstLine(){
		for(int i=1;i<27;i++){
			if(i==4){
				printJ();
			} 
			else if (i==9 || i==25){
				printA();
			}
			else if (i==14 || i== 20){
				printV();
			} else {
				printSpace();
			}
		}
	}
		
	 static void printSecondLine(){
		for(int i=1;i<27;i++){
			if(i==4){
				printJ();
			} 
			else if (i==8 || i==10 || i==24 || i==26){
				printA();
			}
			else if (i==15 || i==19){
				printV();
			}
			else {
				printSpace();
			}
		}
	}
	 static void printSpace(){
		System.out.print(" ");
	}
	
	 static void printJ(){
		System.out.print("J");
	}
	
	 static void printA(){
		System.out.print("A");
	}
	
	 static void printV(){
		System.out.print("V");
	}
}