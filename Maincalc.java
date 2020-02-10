/**
 * 
 */
/**
 * @author Swaroopa
 *
 */
package maincalc;
import java.util.*;
import calculator.*;
public class Maincalc
{
	public static void main(String args[])
	{
		Cal c=new Cal();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to perform arithematic operations:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Enter your choice:\n1:ADDITION\n2:SUBTRACTION\n3:MULTIPLICATION\n4:DIVISION");
		int z=sc.nextInt();
		switch(z)
		{	
			case 1:c.add(x,y);
			       break;
			case 2:c.sub(x,y);
			       break;
			case 3:c.mul(x,y);
			       break;
			case 4:c.div(x,y);
			       break;
			default:System.out.println("SPECIFY WITHIN MENTIONED OPTIONS ONLY");
		}
	}
}