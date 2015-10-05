public class LinkListDriver {

	public static void main(String[] args) {
		Node n = new Node();
		n = null;
		CreateLL c = new CreateLL(n);
		int val[] = {1,4,10, 89, 55};
		for(int i=0; i < val.length; i++) {
			c.addElement(val[i]);
			//c.printLL();
		}		
		int delEle =90;
		c.deleteElement(delEle);
		c.printLL();
	}

}
