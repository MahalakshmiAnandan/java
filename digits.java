import java.util.Scanner;
class Digits{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
System.out.println("enter value for n");
int n=scan.nextInt();
int count=0;
while(n!=0){
n=n/10;
count++;
}
System.out.println("output" +count);
}
}
