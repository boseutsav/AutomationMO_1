package pkg_learning;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class readUserInput {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        @SuppressWarnings("resource")
		Scanner obin1 = new Scanner(System.in);
        @SuppressWarnings("resource")
		Scanner obin2 = new Scanner(System.in);
        @SuppressWarnings("resource")
		Scanner obin3 = new Scanner(System.in);
        @SuppressWarnings("resource")
		Scanner obin4 = new Scanner(System.in);
        
        String[] lines = new String[100];
        String[] tLines = new String[10];
        int count =0;
        System.out.println("Enter your input:");
        int lineCount = obin1.nextInt();
        System.out.println("lineCount:"+lineCount);
        while(count<lineCount) {
            lines[count]=obin2.nextLine();
            count++; 
        }
        
        
		System.out.println("Enter Tcount:");
        int tCount = obin3.nextInt();
        System.out.println("tCount:"+tCount);
        int counter =0;
        while(counter<tCount) {
            tLines[counter]=obin4.nextLine();
            counter++; 
        }      
        Pattern pattern = null;
        Matcher matcher = null;
        for (count=0;count<tCount;count++){
        	System.out.println("word:"+tLines[count]);
            int searchCounter = 0;
            counter=0;
            for (int x=0;x<lineCount;x++){           
                pattern = Pattern.compile("[^\\w]"+tLines[count]+"[^\\w]");
                System.out.println("each: "+lines[x]);
                matcher = pattern.matcher(lines[x]);
                while (matcher.find()){
                    searchCounter+=1;
                    System.out.println(matcher.find());
                }   
                System.out.println("For the word, "+tLines[count]+" frequency till line " +x+" is "+searchCounter);
            }
            System.out.println("For the word, "+tLines[count]+" frequency is "+searchCounter);
        }
        }
}
