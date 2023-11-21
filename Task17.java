

import java.util.Scanner;
class Task17{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter any numbers :");
int val=sc.nextInt();
int val2=1;
for(int i=0;i<=val;i++){
if(!(i%2==0)){
System.out.println(i);
val2+=i;
}
}
System.out.println("Their sum is :"+val2);
}
}