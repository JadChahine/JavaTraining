package com.training.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListTraining {

	// Public Methods

	/**
	 * 
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		String nb1 = getLinkedListReverseNumber(l1);
		String nb2 = getLinkedListReverseNumber(l2);

		Double result = Double.parseDouble(nb1) + Double.parseDouble(nb2);

		return constructListNode(String.format("%.10f", result));
	}

	// Private Methods
	private String getLinkedListReverseNumber(ListNode listNode) {
		List<Integer> lst = new ArrayList<>();

		while (listNode != null) {
			lst.add(listNode.val);

			listNode = listNode.next;
		}
		while (listNode != null)
			;

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

		return nodeStart;
	}

	static public class ListNode {
		private int val;
		private ListNode next;

		public int getVal() {
			return val;
		}

		public void setVal(int val) {
			this.val = val;
		}

		public ListNode getNext() {
			return next;
		}

		public void setNext(ListNode next) {
			this.next = next;
		}

		public ListNode(int x) {
			this.val = x;
		}
	}

}
