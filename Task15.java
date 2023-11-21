import java.util.Scanner;
class Task15{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter any number :");
int num=sc.nextInt();
if(num>0){
System.out.println("It is a positive number");
}
else if(num<0){
System.out.println("It is a negative number");
}
else if(num==0){
System.out.println("zero");
}
}
}