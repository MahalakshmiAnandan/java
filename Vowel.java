import java.util.Scanner;
class Vowel{
public static void main(String[]qwe){
Scanner scan=new Scanner(System.in);
System.out.println("enter a character");
char ch=scan.next().toLowerCase().charAt(2);
if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
System.out.println("vowel");
else
System.out.println("consonant");
}
}
 
