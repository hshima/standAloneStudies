package test.generics;
/**
 * Analisadas as da versão Java 11
 */
import java.util.LinkedList;
import java.util.List;

public class ErasureDoc {
	public static String loophole(Integer x) {
	    List ys = new LinkedList();
	    List xs = ys;
	    xs.add(x); 
	    return(String) ys.iterator().next(); // run time error
	}
	
	public static String loopholeGeneric(Integer x) {
	    List<String> ys = new LinkedList<String>();
	    List xs = ys;
	    xs.add(x); // Compile-time unchecked warning
	    return ys.iterator().next();
	}

	public static void main(String[] args) {
		
		System.out.println(loophole(1));
//		System.out.println(loopholeGeneric(1));

	}

}
