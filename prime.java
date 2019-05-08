import java.util.Scanner;
class Prime{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
int N=scan .nextInt();
int count=0;
for(int i=2; i<N; i++)
{
if(N%i == 0)
{
count++;
break;
}
}
if(count == 0)
{
System.out.println("This is a Prime Number");
}
else
{
System.out.println("This is not a Prime Number");
}
}
}
