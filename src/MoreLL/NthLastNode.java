/**
 * In a LL if you are given N, print the Nth node from the last in the LL.
 * 11-12-13-14-15-16-17-18-19 and N = 2
 * print 18
 * 
 * Do it in one pass.
 * 
 * Logic: Traverse N nodes from the start.
 * When u reach say 12, start another point p2 from beg
 * Increment both pointers till the p1 reaches end.
 * 
 * At the end of this, p2 will reach L-n from the beginning, hence n from the end.
 */

package MoreLL;

public class NthLastNode {

	public int reachNthNode(Node start, int n) {
		Node p1 = start, p2 = start;
		while (n - 1 != 0) {
			p1 = p1.next;
			n--;
		}

		while (p1.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}

		return p2.value;
	}

	public static void main(String[] args) {
		Node start = null;
		
		CreateLL cll = new CreateLL(start);

		int val1[] = { 11, 12, 13, 14, 15, 16, 17, 18 };

		for (int i = 0; i < val1.length; i++) {
			start = cll.addElement(val1[i]);
		}
		
		NthLastNode obj = new NthLastNode();
		int val = obj.reachNthNode(start, 8);
		System.out.println(val);
	}

}
