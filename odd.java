import java.util.Scanner;
class PrintOdd{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
int i=1;
int n=scan.nextInt();
while(i<=n){
if(i%2!=0)
i++;
System.out.println(i);
}
}
}

