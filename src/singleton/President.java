package singleton;

public class President {
	
	private static President instance = new President("윤석열");
	
	public static President getInstance() {
		return instance;
	}
	
	private String name;
	
	private President(String name) {
		this.name = name;
	}
}


// 변수는 다 private로 만들어줘야 한다. 
// heap에 뜨면 접근이 되지 않으니 static에 띄워 접근가능하게 한다.
