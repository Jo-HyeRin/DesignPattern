package adapter;

public class Americano implements Coffee{
	
	private final String NAME = "아메리카노";
	
	@Override
	public String make() {
		System.out.println("시럽 추가");
		return NAME;
	}
}


