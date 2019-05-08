import java.util.Scanner;
class Larger{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
if(a>b&&a>c)
System.out.println(a+ "is larger");
else if(b>c)
System.out.println(b+"is larger");
else
System.out.println(c+ "is larger");
}
}
