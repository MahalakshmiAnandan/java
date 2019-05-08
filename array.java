//stores input in array
import java.util.Scanner;
class Array{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
System.out.println("enter value for N");
int N=scan.nextInt();
int[] arr=new int[N];
for(int i=0;i<N;i++){
int temp=scan.nextInt();
arr[i]=temp;
}
System.out.println("output:");
for(int k=0;k<N;k++)
System.out.println(arr[k]);
}
}
