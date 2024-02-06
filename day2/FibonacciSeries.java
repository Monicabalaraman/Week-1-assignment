package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fibonacci series :");
int n1=0,n2=1,n3,range=9;
System.out.println(" " +n1 +"\n" +" "+n2);
for (int i = 0; i < range; i++) {
	n3=n1+n2;
			System.out.println(" " +n3);
			n1=n2;
			n2=n3;
}
	}

}
