package tn.iit.singletone;

public class MyObject {

	private MyObject() {

	}

	private static class InstanceHolder {
		private static MyObject instance = new MyObject();
	}

	private static MyObject getInstance() {
		return InstanceHolder.instance;
	}

	public static void main(String[] args) {
		MyObject object = MyObject.getInstance();
	}
}
