import java.util.Scanner;

public class Print_1_To_N_UsingWhile 
{
	public static void main(String[] args)
	{
		//loop counter initialisation
		int i =1;

		//create object of scanner class
		Scanner Sc = new Scanner(System.in);

		// enter the value of " n "
		System.out.print("Enter the value n : ");

		// read the value.
		int n = Sc.nextInt();

		System.out.println("Numbers are : ");

		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}