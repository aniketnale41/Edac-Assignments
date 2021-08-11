import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    Scanner scan = new Scanner (System.in);
    int testCasescount = scan.nextInt ();
    for (int i = 0; i < testCasescount; i++)
      {
	int arrSize = scan.nextInt ();
	int arr[] = new int[arrSize];
	for (int j = 0; j < arrSize; j++)
	  {
	    arr[j] = scan.nextInt ();
	  }

	for (int j = arrSize - 1; j >= 0; j--)
	  {
	    System.out.print (arr[j] + " ");
	  }
      }

  }
}
