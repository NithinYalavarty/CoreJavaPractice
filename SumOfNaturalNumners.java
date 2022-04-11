import java.util.Scanner;
class SumOfNaturalNumbers {
public static void main(String[] args) {
		int number, i = 1, sum=0;
  Scanner s=new Scanner(System.in);
		System.out.print(" Please Enter any Number : ");
		number = s.nextInt();
  while(i <= number){ 
    sum = sum + i;
    i++;
   }
System.out.println("Sum of First 100 Natural Numbers is = " + sum); 
  }
}

	