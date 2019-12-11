import java.io.FileReader;

public class ExceptionsMain {
	
	public static void main(String[] args) {
		
	    /* 
	      Caught Exceptions are Exceptions that are checked at compile time.
	      They are all subclasses of the Exception Class.
	      they include ClassNotFoundException, IOException, SQLException
	      
	      The line of code bellow will require throwing or catching
	      FileNotFoundException.  
	     * */
		//FileReader file = new FileReader("somefile.txt");
		
			
		
		/*
		 UnCaught Exceptions are Exceptions that are checked at run time. 
		 They are not checked at compile time.
		 They are all subclasses of RuntimeException
		 
		  Example is Since I'm dividing an integer with 0
		  it should throw ArithmeticException.
		  However the line of code below will not require throwing or catching
		  the Exception at compile time.
		  The Exception will be thrown at run time
	     */
		int num1 = 10;
		int num2 = 0;
		int result = num1/num2;
		
	}
	
}
