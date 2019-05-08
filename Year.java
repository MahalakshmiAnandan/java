import java.util.Scanner;
class Year{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
int year=scan.nextInt();
if(year%100==0 && year%400!=0)
System.out.println("not a leap year");
else if(year%4==0)
System.out.println("leap year");
else
System.out.println("not leap year");
}
}
