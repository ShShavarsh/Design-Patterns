
package visitor;

public class NonEmpty extends BT {

	private BT root = this;

	private BT leftSubTree;

	private BT rightSubTree;

	private String data;

	public String getData() {
		return data;
	}
	
	public NonEmpty(String data) {
		this.data = data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public BT getRoot() {
		return root;
	}

	public void setRoot(BT root) {
		this.root = root;
	}

	public BT getLeftSubTree() {
		return leftSubTree;
	}

	public void setLeftSubTree(BT leftSubTree) {
		this.leftSubTree = leftSubTree;
	}

	public BT getRightSubTree() {
		return rightSubTree;
	}

	public void setRightSubTree(BT rightSubTree) {
		this.rightSubTree = rightSubTree;
	}

	@Override
	int accept(Visitor visitor) {
		return visitor.visitNonEmpty(this);
	}

}
