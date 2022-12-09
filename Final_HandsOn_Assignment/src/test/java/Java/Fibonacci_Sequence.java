package Java;

public class Fibonacci_Sequence {

	public static void main(String[] args) {
		// WAP to find fibonacci sequence 

		int n = 10, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series till "+n+" term : ");
		
		for(int i=1; i<=n; ++i) {
			System.out.print(firstTerm +", ");
			
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

}
