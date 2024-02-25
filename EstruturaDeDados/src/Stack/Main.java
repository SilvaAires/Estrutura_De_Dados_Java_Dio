package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Carro> sc = new Stack<Carro>();
		sc.push(new Carro("f"));
		sc.push(new Carro("v"));
		sc.push(new Carro("c"));
		System.out.println(sc);
		System.out.println(sc.pop());
		System.out.println(sc);
		System.out.println(sc.peek());
		System.out.println(sc);
		System.out.println(sc.empty());
	}
}
