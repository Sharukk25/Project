package FirstPortion;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int a = sc.nextInt();
	int arr[]=new int[a];
	System.out.println("Enter the elements");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	System.out.println("The elements of array are ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	

	}
	
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
      sum =sum+arr[i];
	}
	System.out.println("The sum is "+sum);
	}
}
