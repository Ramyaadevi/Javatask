import java.util.Scanner;
class Task4{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
System.out.println("Enter your Diagonal1 value");
int val1=scan.nextInt();
System.out.println("Enter your Diagonal2 value");
int val2=scan.nextInt();
System.out.println("Area of Rhombus :"+(val1*val2)/2);
}
}