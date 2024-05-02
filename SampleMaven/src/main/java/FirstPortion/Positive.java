package FirstPortion;
import java.util.Scanner;
public class Positive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		if(a>0)
		{
			System.out.println("Number is positive");
		}
			
		else if(a==0)
		{
			System.out.println("Number is zero");
		}
		else
		{
			System.out.println("Negative");
		}
	}

}
