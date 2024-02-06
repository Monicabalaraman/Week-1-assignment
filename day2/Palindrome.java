package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=20020,sum;
		int t=input;
		for (sum=0; t>0; t/=10) {
			int rem=t%10;
					sum=(sum*10)+rem;		
		}
		if (sum==input) {
			System.out.println(input +" is a palindrome number");
		} else {
		System.out.println(input +" is not a palindrome number");
		}
	}

}
