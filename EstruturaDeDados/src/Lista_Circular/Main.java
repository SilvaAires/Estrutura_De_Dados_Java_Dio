package Lista_Circular;

public class Main {
	public static void main(String[] args) {
		ListaCircular<String> lista = new ListaCircular<String>();
		
		lista.add("c0");
		System.out.println(lista);
		lista.remove(0);
		System.out.println(lista);
		
		lista.add("c0");
		lista.add("c1");
		lista.add("c2");
		System.out.println("\n"+lista+"\n");
		lista.add("c3");
		lista.add("c4");
		System.out.println("\n"+lista+"\n");
		System.out.println(lista.get(0));
	}
}
