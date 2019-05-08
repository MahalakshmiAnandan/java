import java.util.Scanner;
class SumArray{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
System.out.println("enter value for N and k");
int N=scan.nextInt();
int k=scan.nextInt();
int[] arr=new int[N];
int sum=0;
for(int i=0;i<N;i++){
int temp=scan.nextInt();
arr[i]=temp;
}
for(int j=0;j<k;j++){
sum=sum+arr[j];
}
System.out.println("output is" +sum);
}
}
