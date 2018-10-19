package com.training.test;

import static org.junit.Assert.*;
import java.util.Map;
import java.util.Scanner;
import org.junit.Test;
import com.training.misc.FirstAssignment;

public class FirstAssignmentTest {

	@Test
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the upper range => ");
		int upperRange = sc.nextInt();
		
		//Exercice.printNumbers(upperRange);
		
		Map<Integer, String> map = FirstAssignment.fillNumbersUsingMap(upperRange);
		
		for (Map.Entry<Integer, String> mapEntry : map.entrySet()) {
			System.out.print(mapEntry.getValue().concat(" "));
		}
		
		assertEquals(map.get(3), "Bat");
		assertEquals(map.get(5), "Man");
		assertEquals(map.get(15), "BatMan");
		assertEquals(map.get(22), "22");
		
		sc.close();
	}

}
