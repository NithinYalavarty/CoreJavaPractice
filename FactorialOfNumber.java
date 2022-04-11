import java.util.Scanner;
class FactorialOfNumber {
public static void main(String[] args) {
		int number, i = 1, factorial=1;
  Scanner s=new Scanner(System.in);
		System.out.print(" Please Enter any Number : ");
		number = s.nextInt();
  while(i <= number){ 
    factorial = i*factorial;
    i++;
    }
System.out.println("factorial of given number = " + factorial); 
  }
}