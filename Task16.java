import java.util.Scanner;
class Task16{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any num");
int num=sc.nextInt();
int val=num;
for(int i=1;i<=10;i++){
val=num*i;
System.out.println(num+"*"+i+"="+val);
}
}
}