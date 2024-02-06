package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,5,3,2,8,6,7};
System.out.println("The missing element is: ");
Arrays.sort(arr);
for (int i = 0; i < arr.length; i++) {
	int a=i+1;
	if (arr[i]!=a) {
System.out.println(a);
break;
	}
	
}
	}

}
