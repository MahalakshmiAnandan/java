import java.util.Scanner;
class PrintEven{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
int i=scan.nextInt();
int n=scan.nextInt();
int start = i;
int end = n;

for( i = start; i <end; i++){
if( i%2 == 0 ){
System.out.println(i);
}
}
}
}
