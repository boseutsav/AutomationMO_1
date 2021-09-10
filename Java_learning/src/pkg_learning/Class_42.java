package pkg_learning;

public class Class_42 {

	int var = 5;
	void method(int tvar) {
		var = 10;//this refers to instance var if no parameter with same var name exists, if parameter has same name then it is param variable
		System.out.println("Value of var:"+var);
		System.out.println("Value of Instance var:"+this.var);
	}
	void method() {
		//var = 40;//this refers to instance var if no parameter with same var name exists
		System.out.println("Value of var:"+var);
		System.out.println("Value of Instance var:"+this.var);
		this.method(4);
	}
	Class_42(){
		this("JBT");
		System.out.println("Inside Constructor without parameter");
	}
	
	public Class_42(String string) {
		System.out.println("Inside Constructor with string parameter as :"+string);
	}
	public static void main(String[] args) {
		//Class_42 obj = new Class_42();
		Class_42 obj2 = new Class_42("second obj");
		//obj.method(20);
		obj2.method();
		System.out.println(obj2.var);

	}

}
