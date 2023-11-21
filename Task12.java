import java.util.Scanner;
class Task12{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number :");
int val=sc.nextInt();
int num=1;
for(int i=1; i<=val; i++){
num *=i;
}
System.out.println("Factorial is: "+num);
}
}