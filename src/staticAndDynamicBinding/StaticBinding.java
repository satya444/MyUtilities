package staticAndDynamicBinding;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author Dilip
 *
 * github Profile: https://github.com/satya444
 *
 */
public class StaticBinding {
	public static void main(String args[])  {
	       @SuppressWarnings("rawtypes")
		Collection c = new HashSet();
	       StaticBinding et = new StaticBinding();
	       et.sort(c);
	      
	    }
	   
	    //overloaded method takes Collection argument
	    @SuppressWarnings("rawtypes")
		public Collection sort(Collection c){
	        System.out.println("Inside Collection sort method");
	        return c;
	    }
	  
	   
	   //another overloaded method which takes HashSet argument which is sub class
	    @SuppressWarnings("rawtypes")
		public Collection sort(HashSet hs){
	        System.out.println("Inside HashSet sort method");
	        return hs;
	    }
	     


}
