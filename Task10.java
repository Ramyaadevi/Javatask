import java.util.Scanner;
import java.lang.Math;
class Task10{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int val = sc.nextInt();
int flag = 0;
for(int i=2;i<=Math.sqrt(val);i++){
if((val%i==0)){
System.out.println("not a prime");
flag = 1;
break;
}
}
if(flag == 0){
System.out.println("prime");
}
}
}