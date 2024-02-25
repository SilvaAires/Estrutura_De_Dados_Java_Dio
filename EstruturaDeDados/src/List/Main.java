package List;

import java.util.ArrayList;
import java.util.List;

import Queue.Carro;

public class Main {
	public static void main(String[] args) {
		List<Carro> lc = new ArrayList<Carro>();
		lc.add(new Carro("f"));
		lc.add(new Carro("c"));
		lc.add(new Carro("a"));
		lc.add(new Carro("b"));
		lc.add(new Carro("r"));
		System.out.println(lc.contains(new Carro("f")));
		System.out.println(lc.get(2));
		System.out.println(lc.indexOf(new Carro("a")));
		System.out.println(lc.remove(2));
		System.out.println(lc);
	}
}
