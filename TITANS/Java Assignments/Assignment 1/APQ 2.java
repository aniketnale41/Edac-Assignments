import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    int n = 6;
    int arr[] = { 12, 35, 1, 10, 34, 1 };
    int largest = Integer.MIN_VALUE;
    int secondLargest = largest;
    for (int i = 0; i < n; i++)
      {
        int crnt = arr[i];
        if(crnt>largest){
            secondLargest = largest;
            largest = crnt;
        }if(crnt>secondLargest && crnt<largest){
            secondLargest = crnt;
        }
      }
    System.out.println(secondLargest);
  }
}
