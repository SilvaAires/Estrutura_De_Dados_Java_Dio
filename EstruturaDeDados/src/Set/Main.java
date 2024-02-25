package Set;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Set<Carro> hsc = new HashSet<Carro>();
		
		hsc.add(new Carro("e"));
		hsc.add(new Carro("d"));
		hsc.add(new Carro("c"));
		hsc.add(new Carro("b"));
		hsc.add(new Carro("a"));
		System.out.println(hsc);
		
	}
}
