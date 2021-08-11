import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    Scanner scan = new Scanner(System.in);
    int testCasescount = scan.nextInt();
    for(int i=0;i<testCasescount;i++) {
        int arrSize = scan.nextInt();
        int arr[] = new int[arrSize];
        for(int j=0;j<arrSize;j++) {
            arr[j] = scan.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int item:arr){
            if(item>max) {
                max = item;
            }
            if(item<min){
                min = item;
            }
        }
        System.out.println(min+" "+max);
    }
    
  }
}
