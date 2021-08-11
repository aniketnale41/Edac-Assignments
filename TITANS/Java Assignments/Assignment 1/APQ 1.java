import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int testCasesCount = scan.nextInt();
	    for(int i=0;i<testCasesCount;i++) {
	        int arraySize = scan.nextInt();
	        int arr[] = new int[arraySize];
	        for(int j=0;j<arraySize;j++) {
	            arr[j] = scan.nextInt();
	        }
	        int limitValue = scan.nextInt();
	        int counter = 0;
	        for(int item: arr) {
	            if(item <= limitValue) {
	                counter++;
	            }
	        }
	        System.out.println(counter);
	    }
	    
	}
}
