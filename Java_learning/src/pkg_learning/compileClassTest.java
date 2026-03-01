package pkg_learning;

/*class Sum {


    int add(int a, int b) {
        return (a+b);   
    }

    public static void main (String args[]) {
        System.out.println(" using Sum class");
        Sum a = new Sum();
        System.out.println("Sum is :" + a.add(5, 10));
    }

    public static void main (int i) {
        System.out.println(" Using Sum class main function with integer argument");
        Sum a = new Sum();
        System.out.println("Sum is :" + a.add(20, 10));
    }

}*/
/*
 * class class2 { public static void main (String args[]) {
 * System.out.println(" using Class2"); Sum a = new Sum();
 * System.out.println("Sum is :" + a.add(5, 10)); Sum.main(null); Sum.main(1); }
 * }
 */
public class compileClassTest{
	final int a=87;
	double df;
	compileClassTest() {
		//System.out.println("inside cons");
	}
	
	public int methName() {
		//double a= 99.3;
		
		return a;
	}
	public int meth() {
		//a=new String("gambat");
		return a;
	}
	
	public static void main (String args[]) {
       compileClassTest obj = new compileClassTest();
       System.out.println(obj.methName());
        
        
    }
	
}