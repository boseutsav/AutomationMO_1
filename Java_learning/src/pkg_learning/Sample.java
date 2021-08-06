package pkg_learning;

public class Sample{
	
}

class A 
{ 
   public static void main(String args[])
   { 
      String str[] = {""}; 
      System.out.println("hi"); 
      B.main(str); 
   } 
} 
class B 
{ 
   public static void main(String... args) 
   { 
     System.out.println("hello");
   }
} 