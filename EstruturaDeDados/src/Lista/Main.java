package Lista;

public class Main {
	public static void main(String[] args) {
		ListasEncadeada<String> lista = new ListasEncadeada<String>();
		
		lista.add("1");
		lista.add("2");
		lista.add("3");
		lista.add("4");
		lista.add("5");
		System.out.println(lista.get(0)+" "+lista.size());
		System.out.println("\n"+lista);
		
		System.out.println(lista.remove(3));
		
		System.out.println("\n"+lista);
	}
}
