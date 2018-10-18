package com.training.test;

import org.junit.Test;
import com.training.linkedlist.LinkedListTraining.ListNode;
import com.training.linkedlist.LinkedListTraining;

public class LinkedListTrainingTest {

	@Test
	public void test() {
		
		ListNode lst1 = new ListNode(9);
		printListNode(lst1);
		
		ListNode lst2 = new ListNode(1);
		ListNode item2 = new ListNode(9);
		ListNode item3 = new ListNode(9);
		ListNode item4 = new ListNode(9);
		ListNode item5 = new ListNode(9);
		ListNode item6 = new ListNode(9);
		ListNode item7 = new ListNode(9);
		ListNode item8 = new ListNode(9);
		ListNode item9 = new ListNode(9);
		ListNode item10 = new ListNode(9);

		lst2.setNext(item2);
		item2.setNext(item3);
		item3.setNext(item4);
		item4.setNext(item5);
		item5.setNext(item6);
		item6.setNext(item7);
		item7.setNext(item8);
		item8.setNext(item9);
		item9.setNext(item10);
		item10.setNext(null);
		
		printListNode(lst2);
		
		ListNode result = new LinkedListTraining().addTwoNumbers(lst1, lst2);
		printListNode(result);
	}
	
	private static void printListNode(ListNode listNode){
		do{
			System.out.print(listNode.getVal() + " ");
			listNode = listNode.getNext();
		}
		while(listNode != null);
		System.out.println();
	}

}
