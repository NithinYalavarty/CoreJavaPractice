import java.util.Scanner;
class Gross_Salary{
public static void main(String args[]){
 Scanner s=new Scanner(System.in);
 int gs,bs,hra,da;
System.out.println("Enter basic salary");
bs=s.nextInt();
if(bs > 20000)
{
hra=bs*30/100;
da=bs*95/100;
gs=bs+hra+da;
 System.out.println("gross salary: "+gs);
}
else if(bs<=20000 && bs>10000)
{
hra=bs*25/100;
da=bs*90/100;
gs=bs+hra+da;
 System.out.println("gross salary: "+gs);
}
else if(bs<=10000)
{
hra=bs*20/100;
da=bs*80/100;
gs=bs+hra+da;
 System.out.println("gross salary: "+gs);
}
else
{
System.out.println("pls check entred salary value");
}
 }
}
