package pkg_learning;
import java.io.*;

import org.testng.annotations.Test;

import okhttp3.internal.http.RealInterceptorChain;
public class stringTrials {

	@Test(enabled=false)
	public void gtchar() {
	      String Str1 = new String("Welcome to Tutorialspoint.com");
	      char[] Str2 = new char[7];
	      try {
	         Str1.getChars(2, 9, Str2, 0);
	         System.out.print("Copied Value = " );
	         System.out.println(Str2 );
	      } catch ( Exception ex) {
	         System.out.println("Raised exception...");
	      }
	   }
	
	@Test(enabled=false)
	public void countName() throws IOException {
		FileReader newFile = new FileReader(System.getProperty("user.dir")+"\\readTestFile.txt");
		BufferedReader br = new BufferedReader(newFile);
		String readLine=null;	
		int lineNo = 1,nameCount,from;
		while ((readLine=br.readLine())!=null) {
			nameCount=from=0;
			while(readLine.toLowerCase().indexOf("utsav",from)!=-1){
				nameCount++;
				from=readLine.toLowerCase().indexOf("utsav",from)+1;				
			}			
			System.out.println("End of line "+ (lineNo) + ", Name appears "+nameCount+"times.");
			lineNo++;
			
		}
	}
	
	@Test//printing an assignment in readline prints the line that's read
	public void testCode() throws IOException {
		FileReader newFile = new FileReader(System.getProperty("user.dir")+"\\readTestFile.txt");
		BufferedReader br = new BufferedReader(newFile);
		String readLine=null;	
		int lineNo = 1,nameCount,from;
		System.out.println(readLine=br.readLine());
		
	}
}
