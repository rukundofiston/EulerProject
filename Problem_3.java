
public class Problem_3 {

	public static void main(String[] args) {
		long N = 600851475143L;
		long largestPrime= 0;
		long[] factors = new long[2];
		 
		for (long i = 2; i * i < N; i++) {
		    if (N % i == 0) { // It is a divisor
		        factors[0] = i;
		        factors[1] = N / i;
		 
		        for (int k = 0; k < 2; k++) {
		            boolean isPrime = true;
		            for (long j = 2; j * j <  factors[k]; j++) {
		                if (factors[k] % j == 0) {
		                    isPrime = false;
		                    break;
		                 }
		             }
		             if (isPrime && factors[k] > largestPrime) {
		            	 largestPrime = factors[k];
		            }
		        }
		    }
		}
		System.out.println("The largest prime factor of the number 600851475143 is "+largestPrime);
	}
}