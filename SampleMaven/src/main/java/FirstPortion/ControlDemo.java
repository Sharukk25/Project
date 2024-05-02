package FirstPortion;

import java.util.Scanner;

public class ControlDemo {

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("Number cannot  be identified ");
				}
		else
		{
			int result = 1;
			for(int i=2;i<=n;i++)
			{
				result = result*i;
				
			}
			System.out.println("Factorial is "+ result);
		}
	}
}