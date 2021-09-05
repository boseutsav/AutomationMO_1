package pkg_learning;

import java.util.Scanner;



public class CharOccuranceCount {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);		
		System.out.print("Enter the string: ");
		String inputStr1 = obj.nextLine();
		String inputStr = inputStr1;
		String srch = new String();
		char check;
		while (true) {
			System.out.print("Enter character to be searched: ");
			srch = obj.nextLine();
			if (srch.length()==1)
			{
				check = srch.toCharArray()[0];
				if (Character.isAlphabetic(check))
					break;	
			}
			else
				System.out.println("Please ensure you enter single alphabetic character.");
		}
		int count=0, start=0;
		while((start = inputStr.indexOf(check))>-1){
			count++;
			inputStr=inputStr.substring(start+1);
		}
		System.out.println("The occurance of "+check+" inside the string \""+inputStr1+"\" is "+count+" times.");
		
				
	}

}
