
package Interpreter;

public class NonEmpty extends BT {

	private String data;

	private BT root = this;

	private BT leftSubTree ;

	private BT rightSubTree;
	
	public NonEmpty(String data) {
		this.data = data;
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

	public BT getRoot() {
		return root;
	}

	public void setRoot(BT root) {
		this.root = root;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public int size() {
		return 1 + (this.leftSubTree != null ? this.leftSubTree.size() : 0) + (this.rightSubTree != null ? this.rightSubTree.size() : 0);
	}

	@Override
	public int height() {
		int max = 0;
		if(this.leftSubTree != null) {
			if(this.rightSubTree != null) {
				if(this.leftSubTree.height() > this.rightSubTree.height()) {
					max = this.leftSubTree.height();
				}else {
					max = this.rightSubTree.height();
				}
			}else {
				max = this.leftSubTree.height();
			}
		}else {
			if(this.rightSubTree != null) {
				max = this.rightSubTree.height();
			}
		}
		
		return max + 1;
	}

	@Override
	public int numberOfLeaves() {
		return (this.leftSubTree != null ? this.leftSubTree.numberOfLeaves() : 0) + (this.rightSubTree != null ? this.rightSubTree.numberOfLeaves() : 0);
	}

}
