package com.training.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;



public class LinkedListTraining {

	public static void main(String[] args) {

		ListNode lst1n1 = new ListNode(2);
		ListNode lst1n2 = new ListNode(4);
		ListNode lst1n3 = new ListNode(3);
		
		lst1n1.next = lst1n2;
		lst1n2.next = lst1n3;
		lst1n3.next = null;
		
		ListNode lst2n1 = new ListNode(5);
		ListNode lst2n2 = new ListNode(6);
		ListNode lst2n3 = new ListNode(4);
		
		lst2n1.next = lst2n2;
		lst2n2.next = lst2n3;
		lst2n3.next = null;
		
		new LinkedListTraining().addTwoNumbers(lst1n1, lst2n1);
		
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		String nb1 = getLinkedListReverseNumber(l1);
		String nb2 = getLinkedListReverseNumber(l2);

		Double result = Double.parseDouble(nb1) + Double.parseDouble(nb2);
		
		return constructListNode(result.toString());
	}

	private String getLinkedListReverseNumber(ListNode listNode) {
		List<Integer> lst = new ArrayList<>();

		while (listNode != null) {
			lst.add(listNode.val);

			listNode = listNode.next;
		}
		while (listNode != null);
			
		Collections.reverse(lst);

		return lst.stream().map(item -> item.toString()).collect(Collectors.joining());
	}

	private ListNode constructListNode(String nbString) {
		System.out.println("nbString : " + nbString);
		
		nbString = nbString.split("\\.")[0];
		
		ListNode nodeStart = null;
		ListNode node = null;
		ListNode previousNode = null;

		for (int index = nbString.length() - 1; index >= 0; index--) {

			node = new ListNode(nbString.charAt(index) - '0');

			if (nodeStart == null) {
				nodeStart = node;
			}

			if (previousNode == null) {
				previousNode = node;
			} else {
				previousNode.next = node;
				previousNode = node;
			}

		}

		node.next = null;

		//printListNode(nodeStart);
		
		return nodeStart;
	}

	 static public class ListNode {
		public int val;
		public ListNode next;

		public ListNode(int x) {
			val = x;
		}
	}
	
	
	/*
	private static void printListNode(ListNode listNode){
		do{
			System.out.print(listNode.val + " ");
			listNode = listNode.next;
		}
		while(listNode != null);
		System.out.println();
	}
	*/

}
