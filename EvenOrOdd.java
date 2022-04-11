import java.util.Scanner;
class EvenOrOdd {
  public static void main(String args[]) {
      int num, a;
      Scanner s=new Scanner(System.in);
     System.out.println("enter number");
     num=s.nextInt();
    a=num%2;
  switch(a)
   {
case 0:   
    System.out.println("Even");
    break;
case 1:   
    System.out.println("odd");
    break;
   }
 }
}