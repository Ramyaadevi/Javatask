import java.util.Arrays;
class ArrayEx{
public static void main(String args[]){
int val1[]={3,4,7,8,0,2};
int val2[]={5,6,7,3,45,5};
//for each
	for (int i : val1){
		System.out.print(i);
			}
//sort
Arrays.sort(val1);
System.out.print(Arrays.toString(val1));

	
}
}