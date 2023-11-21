import java.lang.Math;
class Task14{
public static void main(String args[]){
int j=2;
int count=0;
int sum=0;
while(count<100){
int flag=0;
	for(int i=2;i<=Math.sqrt(j);i++){
		if(j%i==0){
			flag=1;
			break;
		}
	}
	if(flag==0){	
		count++;
		sum+=j;
	}
	j++;
}
System.out.println(count);
System.out.println(sum);
}
}