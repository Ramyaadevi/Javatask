import java.util.Scanner;
class Task7{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter any character :");
char ch = scan.next().charAt(0);	
int asc_val = ch;
System.out.println("The ascii value for"+ch+"is :"+asc_val);
}
}