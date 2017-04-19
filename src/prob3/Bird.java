package prob3;

public abstract class Bird {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void fly(){
		System.out.println("("+this.name + ")가 날아다닙니다.");
	}
	
	public void sing(){
		System.out.println("("+this.name + ")가 소리내어 웁니다.");
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + "]";
	}
}
