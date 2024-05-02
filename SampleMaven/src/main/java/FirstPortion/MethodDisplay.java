package FirstPortion;
import java.util.Scanner;
public class MethodDisplay {
	
	
	static int a;
	public static void main(String agrs[])
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		 a = sc.nextInt();
		display();
		
	}
	public static  int display()
	{
		int result = 1;
	if(a<0)
	{
		System.out.println("Zero cannot be calculated");
	}
	else
	{
    for(int i=1;i<=a;i++)
    {
    	result =result*i;
    	
    	
    }
    
	}
	System.out.println("Factorial of " +a + " is " + result);
	return result;
	
	}
}
	
    


    