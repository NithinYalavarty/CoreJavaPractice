import java.util.Scanner;
class Alphabets {
  public static void main(String args[]){
      char ch;
      Scanner s=new Scanner(System.in);
     System.out.println("Enter an alphabet");
    ch=s.next().charAt(0);
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}