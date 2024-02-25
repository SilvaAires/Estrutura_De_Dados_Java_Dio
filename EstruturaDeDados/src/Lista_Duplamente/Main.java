package Lista_Duplamente;

public class Main {
	public static void main(String[] args) {
		Lista_Duplamente<String> lista = new Lista_Duplamente<String>();
		lista.add("1");
		lista.add("2");
		lista.add("3");
		lista.add("4");
		lista.add("5");
		lista.add("6");
		lista.add("7");
		
		System.out.println(lista);
		
		lista.remove(3);
		lista.addIndex(3,"9");
		
		System.out.println(lista+" \n"+lista.size());
	}
}
