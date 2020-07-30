
public class Problem_2 {

	public static void main(String[] args) {
		int firstNumber=1, secondNumber=2, N=4000000, sum=0;
		while(secondNumber<=N) {
			
			if(firstNumber%2==0) {
				sum = sum + firstNumber;
			}
			
			if(secondNumber%2==0) {
				sum = sum + secondNumber;
			}
			firstNumber = firstNumber + secondNumber;
			secondNumber = firstNumber + secondNumber;
		}		
		//Sum of the even-valued terms: 4613732
		System.out.println("Sum of the even-valued terms: "+ sum);		
	}

}
