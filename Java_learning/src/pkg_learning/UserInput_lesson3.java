/**
 * 
 */
package pkg_learning;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.google.common.io.FileWriteMode;

/**
 * @author Utsav
 *
 */
public class UserInput_lesson3 {

	/**
	 * @param args
	 */
	protected int c =10;
	public static void main(String[] args) throws IOException {
	/*	Scanner obj1 = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = obj1.nextLine();
		System.out.println("your name is "+name+"! Hello!");
		int y = obj1.nextInt();
		System.out.println("The number is "+y+"!");
		obj1.close();
		*/
		FileWriter fw = new FileWriter("D:\\test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.append("new1 line");
		bw.append("new2 line");
		bw.newLine();
		bw.append("sequential", 0, 10);
		bw.close();
		int var=10;
		int b;
		b=++var + ++var + ++var;
		System.out.println(b);
	}

}
