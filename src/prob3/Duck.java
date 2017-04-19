package prob3;

public class Duck extends Bird {

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
		System.out.println("오리("+getName() + ")는 날지 않습니다.");
	}

	@Override
	public void sing() {
		System.out.print("오리");
		super.sing();
	}

	@Override
	public String toString() {
		return "오리의 이름은 " + getName() + " 입니다.";
	}

}
