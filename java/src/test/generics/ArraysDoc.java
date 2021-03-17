package test.generics;
/**
 * Analisadas as da versão Java 11
 */
import java.util.ArrayList;
import java.util.List;

public class ArraysDoc {

	public static void main(String[] args) {
//		// Not really allowed.
//		List<String>[] lsa = new List<String>[10];
//		Object o = lsa;
//		Object[] oa = (Object[]) o;
//		List<Integer> li = new ArrayList<Integer>();
//		li.add(new Integer(3));
//		// Unsound, but passes run time store check
//		oa[1] = li;
//
//		// Run-time error: ClassCastException.
//		String s = lsa[1].get(0);
		
		// OK, array of unbounded wildcard type.
//	//		List<?>[] lsa = new List<?>[10];
		// Error.
		List<String>[] lsa = new List<?>[10];  // Exemplo referia-se ao Java 1.5. Provável que o comportamento foi realinhado para não permitir instanciar interfaces
		Object o = lsa;
		Object[] oa = (Object[]) o;
		List<Integer> li = new ArrayList<Integer>();
		li.add(new Integer(3));
		// Correct.
		oa[1] = li;
		// Run time error, but cast is explicit.
		String s = (String) lsa[1].get(0);
	}
}
