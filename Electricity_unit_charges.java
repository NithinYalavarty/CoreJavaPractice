import java.util.Scanner;
class Electricity_unit_charges{
public static void main(String args[]){
 Scanner s=new Scanner(System.in);
double units,charges;
System.out.println("enter no of units");
units=s.nextInt();
if(units <= 50)
{
double total = units * 0.5;
charges= total+(total*20/100);
 System.out.println("charges: "+charges);
}
else if(units > 50 && units <= 150)
{
double limit = units-50;
double total = (50 * 0.5)+(limit*0.75);
charges= total+(total*20/100);
 System.out.println("charges: "+charges);
}
else if(units > 150 && units <= 250)
{
double limit = units-150;
double total = (50 * 0.5)+(100*0.75)+(limit*1.20);
charges= total+(total*20/100);
 System.out.println("charges: "+charges);
}
else if(units < 250)
{
double limit = units-250;
double total = (50 * 0.5)+(100*0.75)+(100*1.20)+(limit*1.50);
charges= total+(total*20/100);
 System.out.println("charges: "+charges);
}
 }
}
