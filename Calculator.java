import java.util.Scanner;
class Calculator{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first num");
int num1=sc.nextInt();
System.out.println("Enter the second num");
int num2=sc.nextInt();
System.out.println("Enter your choice:Add, Sub, mul, div, mod");
String str=sc.next();
switch(str){
case "Add":{
System.out.println("The addition of :"+(num1)+"+"+(num2)+"="+(num1+num2));
break;
}
case "Sub":{
System.out.println("The subtraction is :"+(num1)+"-"+(num2)+"="+(num1-num2));
break;
}
case "mul":{
System.out.println("The Multiplication is :"+(num1)+"*"+(num2)+"="+(num1*num2));
break;
}
case "div":{
System.out.println("The Division is :"+(num1)+"/"+(num2)+"="+(num1/num2));
break;
}
case "mod":{
System.out.println("The Modulus is :"+(num1)+"%"+(num2)+"="+(num1%num2));
break;
}
case "add":{
System.out.println("The addition of :"+(num1)+"+"+(num2)+"="+(num1+num2));
break;
}
default:{

System.out.println("Invalid");
}
}
}
}