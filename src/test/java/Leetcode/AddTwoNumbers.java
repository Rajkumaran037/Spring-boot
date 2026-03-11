package Leetcode;


public class AddTwoNumbers {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {
		}
		ListNode(int val) {
			this.val = val;
		}
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		@Override
		public String toString() {
			return "ListNode [val=" + val + ", next=" + next + "]";
		}

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode listNode = new ListNode();
		ListNode tempNode = listNode;
		int temp = 0;
		while (l1 != null && l2 != null) {
			int add = 0;
				add = l1.val + l2.val + temp;
				temp = 0;
			if (add > 9) {
				int mod = add % 10;
				temp = add / 10;
				ListNode result = new ListNode();
				result.val = mod;
				tempNode.next = result;
				tempNode = tempNode.next;
			} else {
				ListNode result = new ListNode();
				result.val = add;
				tempNode.next = result;
				tempNode = tempNode.next;
			}
			l1 = l1.next;
			l2 = l2.next;
		}

		while (l1 != null) {
			int add = l1.val + temp;
			if (add > 9) {
				int mod = add % 10;
				temp = add / 10;
				ListNode result = new ListNode();
				result.val = mod;
				tempNode.next = result;
			} else {
				ListNode result = new ListNode();
				result.val = add;
				tempNode.next = result;
				temp = 0;
			}
			tempNode = tempNode.next;
			l1 = l1.next;
		}
		while (l2 != null) {
			int add = l2.val + temp;
			if (add > 9) {
				int mod = add % 10;
				temp = add / 10;
				ListNode result = new ListNode();
				result.val = mod;
				tempNode.next = result;
			} else {
				ListNode result = new ListNode();
				result.val = add;
				tempNode.next = result;
				temp = 0;
			}
			tempNode = tempNode.next;
			l2 = l2.next;
		}
		if (temp > 0) {
			tempNode.next = new ListNode(temp);
		}
		return listNode.next;
	}
	public static void main(String[] args) {
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

		// l1 = [9,9,1]
		ListNode l1 = new ListNode(9);
		l1.next = new ListNode(9);
		l1.next.next = new ListNode(1);

		// l2 = [1]
		ListNode l2 = new ListNode(1);
		System.out.println(addTwoNumbers.addTwoNumbers(l1, l2));
	}

}
