package com.morphean.reverse;

import java.util.Scanner;

public class ReverseInt {
	
	/**
	 * The Algorithm
		
		- Extract out the digit in one’s place. This can be done by modulus operator as n % 10. Store it in a variable(r).
		- Now, in another variable(rev, initialised to zero), multiply it with 10 and add the extracted variable(r) to it. After these two steps, you will see one of the digits from the original variable, comes to the front in the variable ‘rev’
		- Next you need to remove the end digit number from xyz, since the last digit had already been shifted to rev. This can be done by n = n/10.
		- Repeat the above steps till n becomes zero, as that would mean that all the digits from ‘xyz’ has been shifted reversely to ‘rev’
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		/*
		int n = 0, r, rev = 0;
		String sign = "+";
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		sc.close();
		
		if(input.startsWith("-")){
			sign = "-";
		}
		
		n = Integer.parseInt(input.replace(sign, ""));
		
		while(n > 0){
			r = n % 10; 
			rev = rev * 10 + r;
			n = n / 10; 
		}
		
		rev = Integer.parseInt(sign + String.valueOf(rev));
		
		System.out.println("Reversed number = " + rev);
		*/
		
		reverse(+-1126087180);
	}
	
	public static int reverse(int x) {
        
        int n = 0, r, rev = 0;
		String sign = "+";
		
		String input = String.valueOf(x);
		
		if(input.contains("-")){
			sign = "-";
		}
		
		n = Integer.parseInt(input.replace("+", "").replace("-", ""));
		
		while(n > 0){
			r = n % 10; 
			rev = rev * 10 + r;
			n = n / 10; 
		}
		
		rev = Integer.parseInt(sign + String.valueOf(rev));
		
		System.out.println("Reversed number = " + rev);
        
		return rev;
    }

}
