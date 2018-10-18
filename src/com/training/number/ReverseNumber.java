package com.training.number;

public class ReverseNumber {
	
	//Public Methods
	
	public static int reverseNumber(int x) {
		String sign = "+";
		
		String numberString = String.valueOf(x);
		
		if(numberString.contains("-")){
			sign = "-";
		}
		
		x = Integer.parseInt(numberString.replace("+", "").replace("-", ""));
		
		int reverse = reverseInt(x);
		
		reverse = Integer.parseInt(sign + String.valueOf(reverse));
		
		return reverse;
    }
	
	public static int reverseNumber2(int number) {
		int reminder = 0, reverse = 0;

	    while(number != 0) {
	    	reminder = number % 10;
	    	
	        int y = reverse * 10 + reminder;

	        if ( (y - reminder)/10 != reverse){
	        	return 0;
	        }
	        else{
	        	reverse = y;
	        }

	        number = number/10;   
	    }
	    
	    return reverse;
	}
	
	public static int reverseNumber3(int number){
		StringBuilder numberString = new StringBuilder(number);
		
		String reverseNumberString = numberString.reverse().toString();
	
		return Integer.parseInt(reverseNumberString);
	}
	
	public static double reverseDouble(double number){
		
		String numberString = String.valueOf(number);
		
		String[] parts = numberString.split("\\.");
		
		Integer prefix = Integer.parseInt(parts[0]);
		Integer suffix = Integer.parseInt(parts[1]);
		
		Integer prefixReverse = reverseInt(prefix);
		Integer suffixReverse = reverseInt(suffix);
		
		return Double.valueOf(suffixReverse + "." + prefixReverse);
	}
	
	//Private Methods
	
	/**
	 * The Algorithm
		
		- Extract out the digit in one’s place. This can be done by modulus operator as n % 10. Store it in a variable(r).
		- Now, in another variable(rev, initialised to zero), multiply it with 10 and add the extracted variable(r) to it. After these two steps, you will see one of the digits from the original variable, comes to the front in the variable ‘rev’
		- Next you need to remove the end digit number from xyz, since the last digit had already been shifted to rev. This can be done by n = n/10.
		- Repeat the above steps till n becomes zero, as that would mean that all the digits from ‘xyz’ has been shifted reversely to ‘rev’
	 * 
	 * @param args
	 */
	private static int reverseInt(int number){
		int reminder = 0, reverse = 0;
		
		while(number != 0){
			reminder = number % 10; 
			
			reverse = reverse * 10 + reminder;
			
			number = number / 10; 
		}
		
		return reverse;
	}
	

	
    
}
