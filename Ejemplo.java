package anotaciones;

import java.util.*;

public class Ejemplo {

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
	
}
