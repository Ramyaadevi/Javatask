import java.util.Scanner;
class Task5{
public static void main(String args[]){
Scanner obj = new Scanner(System.in);
System.out.print("Enter your num1 :");
int val1 = obj.nextInt();
System.out.print("Enter your num2 :");
int val2 = obj.nextInt();
System.out.println("Before Swapping :"+val1);
System.out.println("Before Swapping :"+val2);
val1=val1+val2;
val2=val1-val2;
val1=val1-val2;
System.out.println("After Swapping :"+val1);
System.out.println("After Swapping :"+val2);
}
}