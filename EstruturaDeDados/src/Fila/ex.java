package Fila;

public class ex {
	public static void main (String[] args) {
		Fila<String> fila = new Fila<String>();
		fila.enqueue("1");
		fila.enqueue("2");
		fila.enqueue("3");
		fila.enqueue("4");
		System.out.println(fila);
		System.out.println(fila.dequeue());
		System.out.println(fila.dequeue());
		System.out.println(fila.dequeue());
		System.out.println(fila.dequeue());
	}
}
