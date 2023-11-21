import java.util.Scanner;
class Fibonacci{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter any number");
int num=sc.nextInt();
int val1=0;
int val2=1;
int val3;
System.out.print(val1+" "+val2);
for(int i=2;i<num;i++){
	val3=val1+val2;
	System.out.print(" "+val3);
	val1=val2;
	val2=val3;
}
}
}