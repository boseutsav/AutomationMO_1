package pkg_learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

public class strToArrList {
	
	@Test
	public void func() {
		
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter string:");
		String lines = ob.next();
		System.out.println(lines);
		String [] myarr = lines.split("");
		for (String c : myarr) {
			System.out.println(c);
		}
		List<String> myList = Arrays.asList(myarr);
		System.out.println("List before: "+myList);
		Collections.shuffle(myList);
		System.out.println("List after: "+myList);
		
				
		
	}

}
