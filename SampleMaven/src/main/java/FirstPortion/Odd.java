package FirstPortion;
import java.util.Scanner;
public class Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char");
        char n = sc.next().charAt(0);
        switch(n)
        {
        case 'a' : 	
        case 'A' :	
        case 'E' :	
        case 'e' :	
        case 'I' :	
        case 'i' :
        case 'O' :
        case 'o' :
        case 'u' :
        case 'U' :
        System.out.println(n +  " is a vowel");
        break;
        default:
        	System.out.println(n+ " is not a vowel");
        }
	}
}
        	
        
        