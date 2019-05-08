import java.util.Scanner;
class Factorial{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
int fact=1,i=1;
while(i<=N){
fact=fact*i;
i++;
}
System.out.println("output" +fact);
}
}
