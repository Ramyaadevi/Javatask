import java.util.Scanner;
class Task11{
public static void main(String args[]){
int vowel=0;
int consonant=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string :");
String str=sc.nextLine();
str=str.toUpperCase();
for(int i=0; i<=str.length(); i++){
if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
vowel++;
}
else{
consonant++;
}
}
System.out.println("vowels count :"+vowel);
System.out.println("consonant count :"+consonant);
}
}