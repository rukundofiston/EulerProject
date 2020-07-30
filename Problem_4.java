public class Problem_4 {

	public static void main(String[] args) {
		int largest_palindrome=656;
		
		for(int i=999; i>0; i--) {
			for(int j=999; j>0; j--) {
				int p = i*j;

				if(isPalindrome(p) && p > largest_palindrome) {
					largest_palindrome = p;
				}
			}
		}
		//Largest palindrome is: 906609
		System.out.println("Largest palindrome is: "+ largest_palindrome);
	}
	
	public static boolean isPalindrome(int a) {
		String original = Integer.toString(a);
		String reverse = new String();

		int length = original.length();   
	    for ( int i = length - 1; i >= 0; i-- ) {
	    	reverse = reverse + original.charAt(i);
	    }
	         
	    if (original.equals(reverse))  
	    	return true;
	    else  
	    	return false;   
	}
}
