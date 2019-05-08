import java.util.Scanner;
class DigitSum{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
System.out.println("enter value for n");
int n=scan.nextInt();
int sum=0;
while(n>0){
sum=sum+n%10;
n=n/10;
}
System.out.println(sum);
}
}
