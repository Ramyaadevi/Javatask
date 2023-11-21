import java.util.Scanner;
class Task3{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your first number :");
int val1=sc.nextInt();
System.out.println("Enter your Second number :");
int val2=sc.nextInt();
System.out.println("Enter your Third number :");
int val3=sc.nextInt();
System.out.println("Enter your Fourth number :");
int val4=sc.nextInt();
System.out.println("Enter your fivth number :");
int val5=sc.nextInt();
System.out.println("Addition of all numbers :"+(val1+val2+val3+val4+val5));
System.out.println("Average of all numbers :"+(val1+val2+val3+val4+val5)/5);
}
}