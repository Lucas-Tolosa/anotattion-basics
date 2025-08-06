package anotaciones;

import java.util.*;

@FunctionalInterface
interface Suma {
    int aplicar(int a, int b);
}

public class Ejemplo implements Suma {

	@Deprecated
	public void noHaceNada() {
	}
	@Override
	public String toString() {
		return "sobreescrito";
	}
	
	@SuppressWarnings("unused")
	String l = "este esta aca de onda";
	
		Object obj = new ArrayList();
		@SuppressWarnings("unchecked")
		List<String> ej = (List<String>) obj;
		
		@Override
		public int aplicar(int a, int b) {
			Suma sumador = (x,d)-> x+d;
			return sumador.aplicar(a, b);
		}
	
}
