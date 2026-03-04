package InheritancePkg;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.ListIterator;

import org.bouncycastle.jcajce.provider.symmetric.ARC4.Base;

public class SubClassD extends SubClassB{
	
	SubClassD(){
		System.out.println("In SubClassD");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ArrayList<String> strlist = new ArrayList<String>(8); strlist.add("Utsav");
		 * strlist.add("Utsav1"); strlist.add("Utsav2");
		 * 
		 * ListIterator<String> itr= strlist.listIterator();
		 * 
		 * while(itr.hasNext()) { System.out.println(itr.next()); }
		 * System.out.println("*******************************************************")
		 * ; System.out.println(strlist.size()); while(itr.hasPrevious()) {
		 * System.out.println(itr.previous()); }
		 */
		SubClassB obj = new SubClassB();
		BaseClassA objBA = obj;
		
		System.out.println(obj.baseMethodAbs());
		System.out.println(objBA.baseMethodAbs());
		System.out.println(objBA instanceof SubClassD);

	}

	/*
	 * @Override public int baseMethod() { // TODO Auto-generated method stub String
	 * str =new String("sample"); System.out.println(str.length());
	 * ArrayList<Integer> alist = new ArrayList<Integer>(); alist.trimToSize();
	 * return 0; }
	 */

}

