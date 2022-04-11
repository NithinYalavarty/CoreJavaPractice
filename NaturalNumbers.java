import java.util.Scanner;
class NaturalNumbers {
	public static void main(String[] args) 
	{
		int number, i = 1;
		Scanner s=new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = s.nextInt();	
		
		while(i <= number)
		{
			System.out.print(i); 
			i++;
		}	
	}
}