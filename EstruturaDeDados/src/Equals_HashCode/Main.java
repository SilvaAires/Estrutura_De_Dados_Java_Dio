package Equals_HashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Carro> lc = new ArrayList<Carro>();
		lc.add(new Carro("F"));
		lc.add(new Carro("C"));
		lc.add(new Carro("V"));
		System.out.println(lc.contains(new Carro("C")));
		System.out.println(new Carro(" ").hashCode());
	}
}
