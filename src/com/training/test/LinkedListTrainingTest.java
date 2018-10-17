package com.training.test;

import static org.junit.Assert.*;

import org.junit.Test;
import com.training.linkedlist.LinkedListTraining.ListNode;
import com.training.linkedlist.LinkedListTraining;

public class LinkedListTrainingTest {

	@Test
	public void test() {
		
		/*
		ListNode lst1 = new ListNode(2);
		ListNode lst1n2 = new ListNode(4);
		ListNode lst1n3 = new ListNode(3);
		
		lst1n1.next = lst1n2;
		lst1n2.next = lst1n3;
		lst1n3.next = null;
		
		printListNode(lst1);
		*/
		
		ListNode lst1 = new ListNode(9);
		printListNode(lst1);
		
		/*
		ListNode lst2 = new ListNode(5);
		ListNode lst2n2 = new ListNode(6);
		ListNode lst2n3 = new ListNode(4);
		
		lst2n1.next = lst2n2;
		lst2n2.next = lst2n3;
		lst2n3.next = null;
		
		printListNode(lst2);
		*/
		
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

		lst2.next = item2;
		item2.next = item3;
		item3.next = item4;
		item4.next = item5;
		item5.next = item6;
		item6.next = item7;
		item7.next = item8;
		item8.next = item9;
		item9.next = item10;
		item10.next = null;
		
		printListNode(lst2);
		
		
		/*
		ListNode resultNode1 = new ListNode(7);
		ListNode resultNode2 = new ListNode(0);
		ListNode resultNode3 = new ListNode(8);
		
		resultNode1.next = resultNode2;
		resultNode2.next = resultNode3;
		resultNode3.next = null;
		*/
		
		
		
		ListNode result = new LinkedListTraining().addTwoNumbers(lst1, lst2);
		printListNode(result);
		
		//assertEquals(result, resultNode1);
	}
	
	private static void printListNode(ListNode listNode){
		do{
			System.out.print(listNode.val + " ");
			listNode = listNode.next;
		}
		while(listNode != null);
		System.out.println();
	}

}
