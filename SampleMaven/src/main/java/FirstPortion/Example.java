package FirstPortion;
import java.util.Scanner;
public class Example {

	
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n= sc.nextInt();
	int result= 1;
	//int m=n;
	if(n<=0)
		System.out.println("Zero cannot be calculated");
	else
	{
	for(int i=1;i<=n;i++)
	{
		result = result*i;
	}
	System.out.println("Factorial is " +result);
	}
	}
}
	