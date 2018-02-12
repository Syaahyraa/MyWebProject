// for Loop
// Program to print a sentence 10 times

class ForLoop {
   public static void main(String[] args) { //args can also be any name
   	String myVar = "Nothing"; //Nothing is immutable which is cannot be change, there will be Nothing in output
    StringBuilder sb = new StringBuilder(10);
    sb.append("Nothing");
    System.out.println("sb:" + sb);
    
    /*
   	//initialization block
      for (int i = 1 ; i <= 10; ++i) { 
         System.out.println("My var at Line " + i + " with Value :" + myVar);
         myVar += "-" + i;
      }
      */
   }
}