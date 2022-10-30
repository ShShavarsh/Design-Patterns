
package visitor;

public class Empty extends BT {

	private String data;

	public Empty(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	int accept(Visitor visitor) {
		return visitor.visitEmpty(this);
	}

}
