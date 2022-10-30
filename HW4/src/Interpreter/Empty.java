package Interpreter;


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
	public int size() {
		return 1;
	}

	@Override
	public int height() {
		return 0;
	}

	@Override
	public int numberOfLeaves() {
		return 1;
	}

}
