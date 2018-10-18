package com.training.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.training.list.ListTraining;

public class ListTrainingTest {

	/**
	 * Find out duplicate number between 1 to N numbers
	 */
	@Test
	public void findListDuplication() {
		List<Integer> lst = new ArrayList<>();
		lst.add(150);
		lst.add(40);
		lst.add(60);
		lst.add(40);
		lst.add(150);
		lst.add(20);
		lst.add(25);
		lst.add(35);
		lst.add(40);
		
		List<Integer> lstDuplicates = ListTraining.getDuplicatesLst(lst);
		
		printList(lstDuplicates);
	}
	
	private static void printList(List<Integer> lst){
		lst.forEach(item -> {
			System.out.print(item + " ");
		});
		
		//lst.forEach(System.out::print);
		System.out.println();
	}

}
