import java.util.Scanner;
class Task9{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter seconds :");
int sec=sc.nextInt();
System.out.println("Minutes ="+(sec/60));
System.out.println("Hour ="+(sec/3600));
}
}
