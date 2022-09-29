package adapter;

public class AmericanoAdapter implements Coffee{ 
	// 1. 타입을 일치시키기 위해 'implements Coffee' 
	
	// 2. 컴포지션하고 생성자 주입받자. 
	private Americano americano;
	
	public AmericanoAdapter(Americano americano) {
		this.americano = americano;
	}

	@Override
	public String make() {
		System.out.println("시럽추가");
		return americano.make();
	}
	
}

