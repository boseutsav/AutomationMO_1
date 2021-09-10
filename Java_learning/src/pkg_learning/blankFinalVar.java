package pkg_learning;

public class blankFinalVar {
	public final int age;
	
	public blankFinalVar() {
		this(25);
	}
	public blankFinalVar(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}


	public static void main(String[] args) {
		blankFinalVar nwvar= new blankFinalVar();
		System.out.println(nwvar.getAge());

	}

}
