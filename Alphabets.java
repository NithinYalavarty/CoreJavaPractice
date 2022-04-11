import java.util.Scanner;
class Alphabets {
  public static void main(String args[]){
      char ch;
      Scanner s=new Scanner(System.in);
     System.out.println("Enter an alphabet");
     ch=s.next().charAt(0);
    switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}