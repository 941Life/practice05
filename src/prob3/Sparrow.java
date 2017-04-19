package prob3;

public class Sparrow extends Bird {

	@Override
	public String getName() {
	
		return super.getName();
	}

	@Override
	public void setName(String name) {

		super.setName(name);
	}

	@Override
	public void fly() {
		System.out.print("참새");
		super.fly();
	}

	@Override
	public void sing() {
		System.out.print("참새");
		super.sing();
	}

	@Override
	public String toString() {
		return "참새의 이름은 " + getName() + " 입니다.";
	}

}
