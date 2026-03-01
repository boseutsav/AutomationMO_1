package pkg_learning;

public class TestBank {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj = new Bank();
		Bank obj1 = new Bank_ABC();
		Bank_ABC obj2 = (Bank_ABC) obj1;
		System.out.println(obj.equals(obj1));
		System.out.println(obj==obj1);
		System.out.println(obj2.equals(obj1));
		System.out.println(obj2==obj1);
		System.out.println(obj2.equals(obj1));
		System.out.println(obj2==obj1);
//ne 
	}
}
