
package visitor;


public class Client {
	
	private BT bt;

	public static void main(String[] args) {
		Client client = new Client();

		// Constructing non empty elements
		NonEmpty a = new NonEmpty("A");
		NonEmpty b = new NonEmpty("B");
		NonEmpty c = new NonEmpty("C");
		NonEmpty e = new NonEmpty("E");
		NonEmpty f = new NonEmpty("F");
		NonEmpty g = new NonEmpty("G");

		// Constructing empty elements
		Empty h = new Empty("H");
		Empty i = new Empty("I");
		Empty j = new Empty("J");
		Empty d = new Empty("D");

		// Constructing the tree

		client.bt = a;

		a.setLeftSubTree(b);
		a.setRightSubTree(c);

		b.setLeftSubTree(d);
		b.setRightSubTree(e);

		e.setLeftSubTree(h);

		c.setLeftSubTree(f);
		c.setRightSubTree(g);

		f.setRightSubTree(i);

		g.setLeftSubTree(j);

		//creating concrete visitors
		Height height = new Height();
		Size size = new Size();
		NumberOfLeaves nOL = new NumberOfLeaves();

		
		System.out.println(client.bt.accept(size));

		System.out.println(client.bt.accept(height));

		System.out.println(client.bt.accept(nOL));


	}

}
