import java.util.Scanner;
class Marks{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the your mark1");
int num1 = sc.nextInt();
System.out.println("Enter the your mark2");
int num2 = sc.nextInt();
System.out.println("Enter the your mark3");
int num3 = sc.nextInt();
int avg=(num1+num2+num3)/3;
	System.out.println("Your total mark is :"+(num1+num2+num3));
	System.out.println("Your average mark is :"+avg);

if(avg>80){
System.out.println("A grade");
}else if(avg<80 && avg>60){
System.out.println("B grade");
}else if(avg<60 && avg>40){
System.out.println("c grade");
}
else{
System.out.println("D grade");
}
}
}


	