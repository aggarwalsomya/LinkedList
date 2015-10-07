public class LinkListDriver {

	public static void main(String[] args) {
		Node n = new Node();
		n = null;
		CreateLL c = new CreateLL(n);
		int val[] = {1,2,3,4,5,6,7,8,9};
		for(int i=0; i < val.length; i++) {
			c.addElement(val[i]);
			//c.printLL();
		}
		
//		int delEle =90;
//		c.deleteElement(delEle);
//		c.printLL();
		
		System.out.println("Length of LL:"+c.findLen());
		c.printLL();
		
		int mid = c.findMid();
		if(mid == 0) {
			System.out.println("Link list is empty");
		}
		else {
			System.out.println("Middle element is:"+mid);
		}
	}

}
