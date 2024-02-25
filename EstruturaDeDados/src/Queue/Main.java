package Queue;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Queue<Carro> qc = new LinkedList<Carro>();
		qc.add(new Carro("f"));
		qc.add(new Carro("c"));
		qc.add(new Carro("a"));
		System.out.println(qc.add(new Carro("Pe")));
		System.out.println(qc);
		System.out.println(qc.offer(new Carro("Z")));
		System.out.println(qc);
		System.out.println(qc.peek());
		System.out.println(qc);
		System.out.println(qc.poll());
		System.out.println(qc);
		System.out.println(qc.isEmpty());
		System.out.println(qc.size());
	}
}
