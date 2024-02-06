package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=23;
boolean prime=false;
for (int i = 2; i < num-1; i++) {
	if (num%i==0) {
	prime=true;
	break;
}
}
	if (!prime) {
		System.out.println("The given number is a prime number");
	} else {
System.out.println("The given number is not a prime number");
	}
	}
	}
	
